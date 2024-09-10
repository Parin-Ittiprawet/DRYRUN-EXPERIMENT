def updateGithubStatus(state) {
    withCredentials([usernamePassword(credentialsId: 'noey-github-kub', usernameVariable: 'USER', passwordVariable: 'PASSWORD')]) {
        sh """
            curl --location 'https://api.github.com/repos/${USER}/DRYRUN-EXPERIMENT/statuses/${GIT_COMMIT}' \
                --header 'Content-Type: application/json' \
                --header 'Authorization: Bearer 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' \
                --data '{"state": "${state}", "context": "Dryrun", "description": "Jenkins", "target_url": "${BUILD_URL}"}'
        """
    }
}

return this
