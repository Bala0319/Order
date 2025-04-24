pipeline {
  agent {
    node {
      label 'Order'
    }

  }
  stages {
    stage('') {
      steps {
        git(url: 'https://github.com/Bala0319/Order.git', branch: 'Main', changelog: true, poll: true)
      }
    }

  }
}