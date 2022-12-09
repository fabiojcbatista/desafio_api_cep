allure generate .\allure-results\ -o .\allure-report\ --clean
Remove-Item .\allure-results\history\
Move-Item .\allure-report\history\ .\allure-results\history\
allure open .\allure-report\