def call() {
    dependencyCheck additionalArguments: '''
        --scan .
        --disableAssembly
    ''',
    odcInstallation: 'OWASP-Dependency-Check',
    outdir: 'dependency-check-report'
}
