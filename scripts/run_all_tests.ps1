Get-ChildItem -Path ".\tests" -Filter *.js | 
Foreach-Object {
    Write-Output "--------------------------------------------------------------------------"
    "****Running {0}****" -f $_.Name | Write-Output
    Write-Output "--------------------------------------------------------------------------"
    $cmd = "node --unhandled-rejections=strict --experimental-modules --experimental-wasm-modules .\tests\{0}" -f $_
    Invoke-Expression $cmd
    
}