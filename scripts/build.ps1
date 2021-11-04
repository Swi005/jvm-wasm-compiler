Get-ChildItem -Path ".\src\wasm" -Filter *.wat | 
Foreach-Object {
    "Building {0}" -f $_.Name | Write-Output
    $file = $_ -replace ".wat"
    $cmd = "wat2wasm .\src\wasm
    \{0}.wat -o .\bin/{0}.wasm" -f $file
    Invoke-Expression $cmd 
    
}