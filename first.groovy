folder('release') {
    displayName('Relelase')

    job('firstgroovyjob') {
        logRotator(-1, 10)
        jdk('java 11')
    scm{
        github('narendrapopuri/Jenkins-DSL', 'main')
        }
    triggers{
           githubPush()
            }
    steps{
                powerShell('echo hello world')
            }
        }
}
