def call() {
    sh '''
        dependency-check.sh \
          --project "Wanderlust-Mega-Project" \
          --scan . \
          --format HTML \
          --out dependency-check-report \
          --disableAssembly
    '''
}
