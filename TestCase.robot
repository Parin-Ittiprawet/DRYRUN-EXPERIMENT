*** Variables ***
${var}    Parin
*** Test Cases ***
TC01 - Test hello
    Log To Console     Hello World ${var}
TC02 - Please fail
    Log To Console     Hello World But Fail Now I passed
    Pass Execution    I want to fail.
TC03 - Test Sleep
    Log To Console     Hello Visitor
    Sleep    10s    Wait for pending
    Log To Console    Bye and bye
