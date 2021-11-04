Get-ChildItem -Path ".\src" -Filter *.wat | 
Foreach-Object {
    "Building {0}" -f $_.Name | Write-Output
    $file = $_ -replace ".wat"
    $cmd = "wat2wasm .\src/{0}.wat -o .\bin/{0}.wasm" -f $file
    Invoke-Expression $cmd 
    
}