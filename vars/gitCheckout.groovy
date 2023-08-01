def call (Map stageParams) {

    checkout([
        $class: 'GitSCM',
        branches: [[name: stageParams]],
        userRemoteConfigs: [[url: stageParams.url]]
    ])

}