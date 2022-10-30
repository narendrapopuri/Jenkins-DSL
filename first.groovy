job('firstgroovyjob') {
    logRotator(-1, 10)
    jdk('java 8')
    scm{
        github('narendrapopuri/Jenkins-DSL', 'main')
    }
    triggers{
        githubPush()
    }
    steps{
        shell(echo 'hello world')
    }

}
