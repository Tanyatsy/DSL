grammar DSL;

program
   : main_block +
   ;

main_block
   : 'begin' calc_block 'end'
   ;

calc_block
   :'name' '->' string string
   serv_stmts serv_block calc_salary
   ;

serv_block
   : '{' details_block '}'
   ;

serv_stmts
   : 'calcFor' number 'serv'
   ;

details_block
   : ('servN' number '{' details_stmts '}')+
   ;

details_stmts
   : ('socialFund' '->' sf_categs) (salary '->' number currency)(optional_taxes '->' number '%')*(special_cases '->' booln)*('exemption' number* '->' number currency)*
   ;

sf_categs
   : first_category
   | second_category
   | third_category
   | fourth_category
   ;

string
   : STRING
   ;

number
   : INT
   | FLOAT
   ;

first_category
   : 'privateSector'
   | 'higherEducation'
   | 'medicalInstitutions'
   ;

second_category
   : 'budgetaryInstitutions'
   | 'publicInstitutions'
   ;

third_category
   : 'privateSectorS'
   | 'higherEducationS'
   | 'medicalInstitutionsS'
   ;

fourth_category
   : 'budgetaryInstitutionsS'
   | 'publicInstitutionsS'
   ;

//S for SPECIAL

optional_taxes
   :'contribPensionFund'
   |'medInsEmployer'
   |'medInsEmployee'
   ;

special_cases
   :'itField'
   |'syndicateContrib'
   ;

salary
   :'netSalary'
   |'grossSalary'
   ;

calc_salary
   :('calcGrossSalary'|'calcNetSalary'|'calcTotalSalary'|'calcTaxes')+
   ;

currency
   :'mdl'
   |'eur'
   |'usd'
   ;

booln
  :'yes'
  |'true'
  |'no'
  |'false'
  ;

INT
   : [0-9] +
   ;


FLOAT
   :INT'.'INT
   ;

STRING
   : ('a' .. 'z' | 'A' .. 'Z')+
   ;

WS
   : [ \r\n\t] -> skip
   ;

