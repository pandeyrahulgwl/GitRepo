#!/usr/local/bin/groovy
publishHTML target: [
            allowMissing: false,
            alwaysLinkToLastBuild: false,
            keepAll: true,
            reportDir: 'target/site/',
            reportFiles: 'cobertura.xml',
            reportName: 'RCov Report' ]