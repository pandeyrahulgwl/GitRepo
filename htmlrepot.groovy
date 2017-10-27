#!/usr/local/bin/groovy
publishHTML target: [
            allowMissing: false,
            alwaysLinkToLastBuild: false,
            keepAll: true,
            reportDir: 'target/site/clover/',
            reportFiles: 'index.html',
            reportName: 'RCov Report' ]