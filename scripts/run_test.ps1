#Runs a .js file with all relevant options only needs the test name.
#--!!WARNING!!!--
#This script only runs it
#To test 

foreach ($arg in $args) {
    $cmd =  "node --unhandled-rejections=strict --experimental-modules --experimental-wasm-modules .\tests\{0}.js" -f $arg
    Invoke-Expression $cmd | Write-Output
}
