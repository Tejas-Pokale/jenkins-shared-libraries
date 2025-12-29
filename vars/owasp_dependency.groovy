def owasp_dependency() {
    dependencyCheck additionalArguments: '''
        --scan .
        --disableAssembly
    ''',
    odcInstallation: 'OWASP-Dependency-Check',
    outdir: 'dependency-check-report'
}
