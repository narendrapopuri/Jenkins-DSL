job('firstgroovyjob') {
    logRotaot(-1, 10)
    jdk('java 8')
    scm{
        github('narendrapopuri/Jenkins-DSL', 'master')
    }
    triggers{
        githubPush()
    }
    steps{
        shell(echo 'hello world')
    }

}