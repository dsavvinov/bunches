package vcsRoots

import jetbrains.buildServer.configs.kotlin.v2018_2.vcs.GitVcsRoot

object BunchToolVcsRoot : GitVcsRoot({
    name = "Bunch Tool"
    url = "https://github.com/JetBrains/bunches.git"
    branch = "refs/heads/early_artifacts_in_composite_build"
})