(ns com.google.cloud.gaming.v1alpha.GameServerDeploymentsServiceClient
  "Service Description: The game server deployment is used to configure the deployment of game
  server software to Agones Fleets in game server clusters.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (GameServerDeploymentsServiceClient gameServerDeploymentsServiceClient = GameServerDeploymentsServiceClient.create()) {
    String formattedName = GameServerDeploymentsServiceClient.formatGameServerDeploymentName(\"[PROJECT]\", \"[LOCATION]\", \"[GAME_SERVER_DEPLOYMENT]\");
    GameServerDeployment response = gameServerDeploymentsServiceClient.getGameServerDeployment(formattedName);
  }

  Note: close() needs to be called on the gameServerDeploymentsServiceClient object to clean up
  resources such as threads. In the example above, try-with-resources is used, which automatically
  calls close().

  The surface of this class includes several types of Java methods for each of the API's
  methods:


    A \"flattened\" method. With this type of method, the fields of the request type have been
        converted into function parameters. It may be the case that not all fields are available as
        parameters, and not every API method will have a flattened method entry point.
    A \"request object\" method. This type of method only takes one parameter, a request object,
        which must be constructed before the call. Not every API method will have a request object
        method.
    A \"callable\" method. This type of method takes no parameters and returns an immutable API
        callable object, which can be used to initiate calls to the service.


  See the individual methods for example code.

  Many parameters require resource names to be formatted in a particular way. To assist with
  these names, this class includes a format method for each type of name, and additionally a parse
  method to extract the individual identifiers contained within names that are returned.

  This class can be customized by passing in a custom instance of
  GameServerDeploymentsServiceSettings to create(). For example:

  To customize credentials:



  GameServerDeploymentsServiceSettings gameServerDeploymentsServiceSettings =
      GameServerDeploymentsServiceSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  GameServerDeploymentsServiceClient gameServerDeploymentsServiceClient =
      GameServerDeploymentsServiceClient.create(gameServerDeploymentsServiceSettings);

  To customize the endpoint:



  GameServerDeploymentsServiceSettings gameServerDeploymentsServiceSettings =
      GameServerDeploymentsServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
  GameServerDeploymentsServiceClient gameServerDeploymentsServiceClient =
      GameServerDeploymentsServiceClient.create(gameServerDeploymentsServiceSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.gaming.v1alpha GameServerDeploymentsServiceClient]))

(defn *format-game-server-deployment-name
  "Deprecated. Use the GameServerDeploymentName class instead.

  project - `java.lang.String`
  location - `java.lang.String`
  game-server-deployment - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String location ^java.lang.String game-server-deployment]
    (GameServerDeploymentsServiceClient/formatGameServerDeploymentName project location game-server-deployment)))

(defn *format-location-name
  "Deprecated. Use the LocationName class instead.

  project - `java.lang.String`
  location - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String location]
    (GameServerDeploymentsServiceClient/formatLocationName project location)))

(defn *parse-project-from-game-server-deployment-name
  "Deprecated. Use the GameServerDeploymentName class instead.

  game-server-deployment-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String game-server-deployment-name]
    (GameServerDeploymentsServiceClient/parseProjectFromGameServerDeploymentName game-server-deployment-name)))

(defn *parse-location-from-game-server-deployment-name
  "Deprecated. Use the GameServerDeploymentName class instead.

  game-server-deployment-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String game-server-deployment-name]
    (GameServerDeploymentsServiceClient/parseLocationFromGameServerDeploymentName game-server-deployment-name)))

(defn *parse-game-server-deployment-from-game-server-deployment-name
  "Deprecated. Use the GameServerDeploymentName class instead.

  game-server-deployment-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String game-server-deployment-name]
    (GameServerDeploymentsServiceClient/parseGameServerDeploymentFromGameServerDeploymentName game-server-deployment-name)))

(defn *parse-project-from-location-name
  "Deprecated. Use the LocationName class instead.

  location-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String location-name]
    (GameServerDeploymentsServiceClient/parseProjectFromLocationName location-name)))

(defn *parse-location-from-location-name
  "Deprecated. Use the LocationName class instead.

  location-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String location-name]
    (GameServerDeploymentsServiceClient/parseLocationFromLocationName location-name)))

(defn *create
  "Constructs an instance of GameServerDeploymentsServiceClient, using the given settings. The
   channels are created based on the settings passed in, or defaults for any settings that are not
   set.

  settings - `com.google.cloud.gaming.v1alpha.GameServerDeploymentsServiceSettings`

  returns: `com.google.cloud.gaming.v1alpha.GameServerDeploymentsServiceClient`

  throws: java.io.IOException"
  (^com.google.cloud.gaming.v1alpha.GameServerDeploymentsServiceClient [^com.google.cloud.gaming.v1alpha.GameServerDeploymentsServiceSettings settings]
    (GameServerDeploymentsServiceClient/create settings))
  (^com.google.cloud.gaming.v1alpha.GameServerDeploymentsServiceClient []
    (GameServerDeploymentsServiceClient/create )))

(defn list-game-server-deployments-paged-callable
  "Lists game server deployments in a given project and location.

   Sample code:



   try (GameServerDeploymentsServiceClient gameServerDeploymentsServiceClient = GameServerDeploymentsServiceClient.create()) {
     String formattedParent = GameServerDeploymentsServiceClient.formatLocationName(\"[PROJECT]\", \"[LOCATION]\");
     ListGameServerDeploymentsRequest request = ListGameServerDeploymentsRequest.newBuilder()
       .setParent(formattedParent)
       .build();
     ApiFuture<ListGameServerDeploymentsPagedResponse> future = gameServerDeploymentsServiceClient.listGameServerDeploymentsPagedCallable().futureCall(request);
     // Do something
     for (GameServerDeployment element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.ListGameServerDeploymentsRequest,com.google.cloud.gaming.v1alpha.GameServerDeploymentsServiceClient$ListGameServerDeploymentsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GameServerDeploymentsServiceClient this]
    (-> this (.listGameServerDeploymentsPagedCallable))))

(defn delete-game-server-deployment-operation-callable
  "Deletes a single game server deployment.

   Sample code:



   try (GameServerDeploymentsServiceClient gameServerDeploymentsServiceClient = GameServerDeploymentsServiceClient.create()) {
     String formattedName = GameServerDeploymentsServiceClient.formatGameServerDeploymentName(\"[PROJECT]\", \"[LOCATION]\", \"[GAME_SERVER_DEPLOYMENT]\");
     DeleteGameServerDeploymentRequest request = DeleteGameServerDeploymentRequest.newBuilder()
       .setName(formattedName)
       .build();
     OperationFuture<Empty, Empty> future = gameServerDeploymentsServiceClient.deleteGameServerDeploymentOperationCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.DeleteGameServerDeploymentRequest,com.google.protobuf.Empty,com.google.protobuf.Empty>`"
  ([^GameServerDeploymentsServiceClient this]
    (-> this (.deleteGameServerDeploymentOperationCallable))))

(defn set-rollout-target-operation-callable
  "Sets rollout target for the ongoing game server deployment rollout in the specified clusters
   and based on the given rollout percentage. Default is 0.

   Sample code:



   try (GameServerDeploymentsServiceClient gameServerDeploymentsServiceClient = GameServerDeploymentsServiceClient.create()) {
     String formattedName = GameServerDeploymentsServiceClient.formatGameServerDeploymentName(\"[PROJECT]\", \"[LOCATION]\", \"[GAME_SERVER_DEPLOYMENT]\");
     List<ClusterPercentageSelector> clusterPercentageSelector = new ArrayList<>();
     SetRolloutTargetRequest request = SetRolloutTargetRequest.newBuilder()
       .setName(formattedName)
       .addAllClusterPercentageSelector(clusterPercentageSelector)
       .build();
     OperationFuture<GameServerDeployment, Empty> future = gameServerDeploymentsServiceClient.setRolloutTargetOperationCallable().futureCall(request);
     // Do something
     GameServerDeployment response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.SetRolloutTargetRequest,com.google.cloud.gaming.v1alpha.GameServerDeployment,com.google.protobuf.Empty>`"
  ([^GameServerDeploymentsServiceClient this]
    (-> this (.setRolloutTargetOperationCallable))))

(defn get-game-server-deployment
  "Gets details of a single game server deployment.

   Sample code:



   try (GameServerDeploymentsServiceClient gameServerDeploymentsServiceClient = GameServerDeploymentsServiceClient.create()) {
     String formattedName = GameServerDeploymentsServiceClient.formatGameServerDeploymentName(\"[PROJECT]\", \"[LOCATION]\", \"[GAME_SERVER_DEPLOYMENT]\");
     GameServerDeployment response = gameServerDeploymentsServiceClient.getGameServerDeployment(formattedName);
   }

  name - Required. The name of the game server deployment to retrieve, using the form: `projects/{project_id}/locations/{location}/gameServerDeployments/{deployment_id}` - `java.lang.String`

  returns: `com.google.cloud.gaming.v1alpha.GameServerDeployment`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.gaming.v1alpha.GameServerDeployment [^GameServerDeploymentsServiceClient this ^java.lang.String name]
    (-> this (.getGameServerDeployment name))))

(defn get-deployment-target-callable
  "Retrieves information on the rollout target of the deployment, e.g. the target percentage of
   game servers running stable_game_server_template and new_game_server_template in clusters.

   Sample code:



   try (GameServerDeploymentsServiceClient gameServerDeploymentsServiceClient = GameServerDeploymentsServiceClient.create()) {
     String formattedName = GameServerDeploymentsServiceClient.formatGameServerDeploymentName(\"[PROJECT]\", \"[LOCATION]\", \"[GAME_SERVER_DEPLOYMENT]\");
     GetDeploymentTargetRequest request = GetDeploymentTargetRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<DeploymentTarget> future = gameServerDeploymentsServiceClient.getDeploymentTargetCallable().futureCall(request);
     // Do something
     DeploymentTarget response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.GetDeploymentTargetRequest,com.google.cloud.gaming.v1alpha.DeploymentTarget>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GameServerDeploymentsServiceClient this]
    (-> this (.getDeploymentTargetCallable))))

(defn set-rollout-target-callable
  "Sets rollout target for the ongoing game server deployment rollout in the specified clusters
   and based on the given rollout percentage. Default is 0.

   Sample code:



   try (GameServerDeploymentsServiceClient gameServerDeploymentsServiceClient = GameServerDeploymentsServiceClient.create()) {
     String formattedName = GameServerDeploymentsServiceClient.formatGameServerDeploymentName(\"[PROJECT]\", \"[LOCATION]\", \"[GAME_SERVER_DEPLOYMENT]\");
     List<ClusterPercentageSelector> clusterPercentageSelector = new ArrayList<>();
     SetRolloutTargetRequest request = SetRolloutTargetRequest.newBuilder()
       .setName(formattedName)
       .addAllClusterPercentageSelector(clusterPercentageSelector)
       .build();
     ApiFuture<Operation> future = gameServerDeploymentsServiceClient.setRolloutTargetCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.SetRolloutTargetRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GameServerDeploymentsServiceClient this]
    (-> this (.setRolloutTargetCallable))))

(defn get-settings
  "returns: `com.google.cloud.gaming.v1alpha.GameServerDeploymentsServiceSettings`"
  (^com.google.cloud.gaming.v1alpha.GameServerDeploymentsServiceSettings [^GameServerDeploymentsServiceClient this]
    (-> this (.getSettings))))

(defn create-game-server-deployment-operation-callable
  "Creates a new game server deployment in a given project and location.

   Sample code:



   try (GameServerDeploymentsServiceClient gameServerDeploymentsServiceClient = GameServerDeploymentsServiceClient.create()) {
     String formattedParent = GameServerDeploymentsServiceClient.formatLocationName(\"[PROJECT]\", \"[LOCATION]\");
     String deploymentId = \"\";
     GameServerDeployment gameServerDeployment = GameServerDeployment.newBuilder().build();
     CreateGameServerDeploymentRequest request = CreateGameServerDeploymentRequest.newBuilder()
       .setParent(formattedParent)
       .setDeploymentId(deploymentId)
       .setGameServerDeployment(gameServerDeployment)
       .build();
     OperationFuture<GameServerDeployment, Empty> future = gameServerDeploymentsServiceClient.createGameServerDeploymentOperationCallable().futureCall(request);
     // Do something
     GameServerDeployment response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.CreateGameServerDeploymentRequest,com.google.cloud.gaming.v1alpha.GameServerDeployment,com.google.protobuf.Empty>`"
  ([^GameServerDeploymentsServiceClient this]
    (-> this (.createGameServerDeploymentOperationCallable))))

(defn get-game-server-deployment-callable
  "Gets details of a single game server deployment.

   Sample code:



   try (GameServerDeploymentsServiceClient gameServerDeploymentsServiceClient = GameServerDeploymentsServiceClient.create()) {
     String formattedName = GameServerDeploymentsServiceClient.formatGameServerDeploymentName(\"[PROJECT]\", \"[LOCATION]\", \"[GAME_SERVER_DEPLOYMENT]\");
     GetGameServerDeploymentRequest request = GetGameServerDeploymentRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<GameServerDeployment> future = gameServerDeploymentsServiceClient.getGameServerDeploymentCallable().futureCall(request);
     // Do something
     GameServerDeployment response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.GetGameServerDeploymentRequest,com.google.cloud.gaming.v1alpha.GameServerDeployment>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GameServerDeploymentsServiceClient this]
    (-> this (.getGameServerDeploymentCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.gaming.v1alpha.stub.GameServerDeploymentsServiceStub`"
  ([^GameServerDeploymentsServiceClient this]
    (-> this (.getStub))))

(defn create-game-server-deployment-callable
  "Creates a new game server deployment in a given project and location.

   Sample code:



   try (GameServerDeploymentsServiceClient gameServerDeploymentsServiceClient = GameServerDeploymentsServiceClient.create()) {
     String formattedParent = GameServerDeploymentsServiceClient.formatLocationName(\"[PROJECT]\", \"[LOCATION]\");
     String deploymentId = \"\";
     GameServerDeployment gameServerDeployment = GameServerDeployment.newBuilder().build();
     CreateGameServerDeploymentRequest request = CreateGameServerDeploymentRequest.newBuilder()
       .setParent(formattedParent)
       .setDeploymentId(deploymentId)
       .setGameServerDeployment(gameServerDeployment)
       .build();
     ApiFuture<Operation> future = gameServerDeploymentsServiceClient.createGameServerDeploymentCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.CreateGameServerDeploymentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GameServerDeploymentsServiceClient this]
    (-> this (.createGameServerDeploymentCallable))))

(defn get-deployment-target
  "Retrieves information on the rollout target of the deployment, e.g. the target percentage of
   game servers running stable_game_server_template and new_game_server_template in clusters.

   Sample code:



   try (GameServerDeploymentsServiceClient gameServerDeploymentsServiceClient = GameServerDeploymentsServiceClient.create()) {
     String formattedName = GameServerDeploymentsServiceClient.formatGameServerDeploymentName(\"[PROJECT]\", \"[LOCATION]\", \"[GAME_SERVER_DEPLOYMENT]\");
     DeploymentTarget response = gameServerDeploymentsServiceClient.getDeploymentTarget(formattedName);
   }

  name - Required. The name of the game server deployment, using the form: `projects/{project_id}/locations/{location}/gameServerDeployments/{deployment_id}` - `java.lang.String`

  returns: `com.google.cloud.gaming.v1alpha.DeploymentTarget`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.gaming.v1alpha.DeploymentTarget [^GameServerDeploymentsServiceClient this ^java.lang.String name]
    (-> this (.getDeploymentTarget name))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GameServerDeploymentsServiceClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GameServerDeploymentsServiceClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn delete-game-server-deployment-callable
  "Deletes a single game server deployment.

   Sample code:



   try (GameServerDeploymentsServiceClient gameServerDeploymentsServiceClient = GameServerDeploymentsServiceClient.create()) {
     String formattedName = GameServerDeploymentsServiceClient.formatGameServerDeploymentName(\"[PROJECT]\", \"[LOCATION]\", \"[GAME_SERVER_DEPLOYMENT]\");
     DeleteGameServerDeploymentRequest request = DeleteGameServerDeploymentRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<Operation> future = gameServerDeploymentsServiceClient.deleteGameServerDeploymentCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.DeleteGameServerDeploymentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GameServerDeploymentsServiceClient this]
    (-> this (.deleteGameServerDeploymentCallable))))

(defn shutdown
  ""
  ([^GameServerDeploymentsServiceClient this]
    (-> this (.shutdown))))

(defn list-game-server-deployments-callable
  "Lists game server deployments in a given project and location.

   Sample code:



   try (GameServerDeploymentsServiceClient gameServerDeploymentsServiceClient = GameServerDeploymentsServiceClient.create()) {
     String formattedParent = GameServerDeploymentsServiceClient.formatLocationName(\"[PROJECT]\", \"[LOCATION]\");
     ListGameServerDeploymentsRequest request = ListGameServerDeploymentsRequest.newBuilder()
       .setParent(formattedParent)
       .build();
     while (true) {
       ListGameServerDeploymentsResponse response = gameServerDeploymentsServiceClient.listGameServerDeploymentsCallable().call(request);
       for (GameServerDeployment element : response.getGameServerDeploymentsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.ListGameServerDeploymentsRequest,com.google.cloud.gaming.v1alpha.ListGameServerDeploymentsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GameServerDeploymentsServiceClient this]
    (-> this (.listGameServerDeploymentsCallable))))

(defn update-game-server-deployment-callable
  "Patches a game server deployment.

   Sample code:



   try (GameServerDeploymentsServiceClient gameServerDeploymentsServiceClient = GameServerDeploymentsServiceClient.create()) {
     GameServerDeployment gameServerDeployment = GameServerDeployment.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     UpdateGameServerDeploymentRequest request = UpdateGameServerDeploymentRequest.newBuilder()
       .setGameServerDeployment(gameServerDeployment)
       .setUpdateMask(updateMask)
       .build();
     ApiFuture<Operation> future = gameServerDeploymentsServiceClient.updateGameServerDeploymentCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GameServerDeploymentsServiceClient this]
    (-> this (.updateGameServerDeploymentCallable))))

(defn list-game-server-deployments
  "Lists game server deployments in a given project and location.

   Sample code:



   try (GameServerDeploymentsServiceClient gameServerDeploymentsServiceClient = GameServerDeploymentsServiceClient.create()) {
     String formattedParent = GameServerDeploymentsServiceClient.formatLocationName(\"[PROJECT]\", \"[LOCATION]\");
     for (GameServerDeployment element : gameServerDeploymentsServiceClient.listGameServerDeployments(formattedParent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The parent resource name, using the form: `projects/{project_id}/locations/{location}`. - `java.lang.String`

  returns: `com.google.cloud.gaming.v1alpha.GameServerDeploymentsServiceClient$ListGameServerDeploymentsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.gaming.v1alpha.GameServerDeploymentsServiceClient$ListGameServerDeploymentsPagedResponse [^GameServerDeploymentsServiceClient this ^java.lang.String parent]
    (-> this (.listGameServerDeployments parent))))

(defn update-game-server-deployment-operation-callable
  "Patches a game server deployment.

   Sample code:



   try (GameServerDeploymentsServiceClient gameServerDeploymentsServiceClient = GameServerDeploymentsServiceClient.create()) {
     GameServerDeployment gameServerDeployment = GameServerDeployment.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     UpdateGameServerDeploymentRequest request = UpdateGameServerDeploymentRequest.newBuilder()
       .setGameServerDeployment(gameServerDeployment)
       .setUpdateMask(updateMask)
       .build();
     OperationFuture<GameServerDeployment, Empty> future = gameServerDeploymentsServiceClient.updateGameServerDeploymentOperationCallable().futureCall(request);
     // Do something
     GameServerDeployment response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest,com.google.cloud.gaming.v1alpha.GameServerDeployment,com.google.protobuf.Empty>`"
  ([^GameServerDeploymentsServiceClient this]
    (-> this (.updateGameServerDeploymentOperationCallable))))

(defn update-game-server-deployment-async
  "Patches a game server deployment.

   Sample code:



   try (GameServerDeploymentsServiceClient gameServerDeploymentsServiceClient = GameServerDeploymentsServiceClient.create()) {
     GameServerDeployment gameServerDeployment = GameServerDeployment.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     GameServerDeployment response = gameServerDeploymentsServiceClient.updateGameServerDeploymentAsync(gameServerDeployment, updateMask).get();
   }

  game-server-deployment - Required. The game server deployment to be updated. Only fields specified in update_mask are updated. - `com.google.cloud.gaming.v1alpha.GameServerDeployment`
  update-mask - Required. Mask of fields to update. At least one path must be supplied in this field. For the `FieldMask` definition, see https: //developers.google.com/protocol-buffers // /docs/reference/google.protobuf#fieldmask - `com.google.protobuf.FieldMask`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.gaming.v1alpha.GameServerDeployment,com.google.protobuf.Empty>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^GameServerDeploymentsServiceClient this ^com.google.cloud.gaming.v1alpha.GameServerDeployment game-server-deployment ^com.google.protobuf.FieldMask update-mask]
    (-> this (.updateGameServerDeploymentAsync game-server-deployment update-mask)))
  ([^GameServerDeploymentsServiceClient this ^com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest request]
    (-> this (.updateGameServerDeploymentAsync request))))

(defn get-operations-client
  "Returns the OperationsClient that can be used to query the status of a long-running operation
   returned by another API method call.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.longrunning.OperationsClient`"
  ([^GameServerDeploymentsServiceClient this]
    (-> this (.getOperationsClient))))

(defn commit-rollout-operation-callable
  "Commits the ongoing game server deployment rollout by setting the rollout percentage to 100 in
   all clusters whose labels match labels in the game server template.

   Sample code:



   try (GameServerDeploymentsServiceClient gameServerDeploymentsServiceClient = GameServerDeploymentsServiceClient.create()) {
     String formattedName = GameServerDeploymentsServiceClient.formatGameServerDeploymentName(\"[PROJECT]\", \"[LOCATION]\", \"[GAME_SERVER_DEPLOYMENT]\");
     CommitRolloutRequest request = CommitRolloutRequest.newBuilder()
       .setName(formattedName)
       .build();
     OperationFuture<GameServerDeployment, Empty> future = gameServerDeploymentsServiceClient.commitRolloutOperationCallable().futureCall(request);
     // Do something
     GameServerDeployment response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.CommitRolloutRequest,com.google.cloud.gaming.v1alpha.GameServerDeployment,com.google.protobuf.Empty>`"
  ([^GameServerDeploymentsServiceClient this]
    (-> this (.commitRolloutOperationCallable))))

(defn revert-rollout-async
  "Rolls back the ongoing game server deployment rollout by setting the rollout percentage to 0 in
   all clusters whose labels match labels in the game server template.

   Sample code:



   try (GameServerDeploymentsServiceClient gameServerDeploymentsServiceClient = GameServerDeploymentsServiceClient.create()) {
     String formattedName = GameServerDeploymentsServiceClient.formatGameServerDeploymentName(\"[PROJECT]\", \"[LOCATION]\", \"[GAME_SERVER_DEPLOYMENT]\");
     GameServerDeployment response = gameServerDeploymentsServiceClient.revertRolloutAsync(formattedName).get();
   }

  name - Required. The name of the game server deployment to deploy, using the form: `projects/{project_id}/locations/{location}/gameServerDeployments/{deployment_id}` - `java.lang.String`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.gaming.v1alpha.GameServerDeployment,com.google.protobuf.Empty>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^GameServerDeploymentsServiceClient this ^java.lang.String name]
    (-> this (.revertRolloutAsync name))))

(defn close
  ""
  ([^GameServerDeploymentsServiceClient this]
    (-> this (.close))))

(defn set-rollout-target-async
  "Sets rollout target for the ongoing game server deployment rollout in the specified clusters
   and based on the given rollout percentage. Default is 0.

   Sample code:



   try (GameServerDeploymentsServiceClient gameServerDeploymentsServiceClient = GameServerDeploymentsServiceClient.create()) {
     String formattedName = GameServerDeploymentsServiceClient.formatGameServerDeploymentName(\"[PROJECT]\", \"[LOCATION]\", \"[GAME_SERVER_DEPLOYMENT]\");
     List<ClusterPercentageSelector> clusterPercentageSelector = new ArrayList<>();
     GameServerDeployment response = gameServerDeploymentsServiceClient.setRolloutTargetAsync(formattedName, clusterPercentageSelector).get();
   }

  name - Required. The name of the game server deployment, using the form: `projects/{project_id}/locations/{location}/gameServerDeployments/{deployment_id}` - `java.lang.String`
  cluster-percentage-selector - Required. The percentage of game servers that should run the new game server template in the specified clusters. Default is 0. - `java.util.List`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.gaming.v1alpha.GameServerDeployment,com.google.protobuf.Empty>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^GameServerDeploymentsServiceClient this ^java.lang.String name ^java.util.List cluster-percentage-selector]
    (-> this (.setRolloutTargetAsync name cluster-percentage-selector)))
  ([^GameServerDeploymentsServiceClient this ^com.google.cloud.gaming.v1alpha.SetRolloutTargetRequest request]
    (-> this (.setRolloutTargetAsync request))))

(defn create-game-server-deployment-async
  "Creates a new game server deployment in a given project and location.

   Sample code:



   try (GameServerDeploymentsServiceClient gameServerDeploymentsServiceClient = GameServerDeploymentsServiceClient.create()) {
     String formattedParent = GameServerDeploymentsServiceClient.formatLocationName(\"[PROJECT]\", \"[LOCATION]\");
     String deploymentId = \"\";
     GameServerDeployment gameServerDeployment = GameServerDeployment.newBuilder().build();
     GameServerDeployment response = gameServerDeploymentsServiceClient.createGameServerDeploymentAsync(formattedParent, deploymentId, gameServerDeployment).get();
   }

  parent - Required. The parent resource name, using the form: `projects/{project_id}/locations/{location}`. - `java.lang.String`
  deployment-id - Required. The ID of the game server deployment resource to be created. - `java.lang.String`
  game-server-deployment - Required. The game server deployment resource to be created. - `com.google.cloud.gaming.v1alpha.GameServerDeployment`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.gaming.v1alpha.GameServerDeployment,com.google.protobuf.Empty>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^GameServerDeploymentsServiceClient this ^java.lang.String parent ^java.lang.String deployment-id ^com.google.cloud.gaming.v1alpha.GameServerDeployment game-server-deployment]
    (-> this (.createGameServerDeploymentAsync parent deployment-id game-server-deployment)))
  ([^GameServerDeploymentsServiceClient this ^com.google.cloud.gaming.v1alpha.CreateGameServerDeploymentRequest request]
    (-> this (.createGameServerDeploymentAsync request))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GameServerDeploymentsServiceClient this]
    (-> this (.isTerminated))))

(defn delete-game-server-deployment-async
  "Deletes a single game server deployment.

   Sample code:



   try (GameServerDeploymentsServiceClient gameServerDeploymentsServiceClient = GameServerDeploymentsServiceClient.create()) {
     String formattedName = GameServerDeploymentsServiceClient.formatGameServerDeploymentName(\"[PROJECT]\", \"[LOCATION]\", \"[GAME_SERVER_DEPLOYMENT]\");
     gameServerDeploymentsServiceClient.deleteGameServerDeploymentAsync(formattedName).get();
   }

  name - Required. The name of the game server deployment to delete, using the form: `projects/{project_id}/locations/{location}/gameServerDeployments/{deployment_id}` - `java.lang.String`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.protobuf.Empty,com.google.protobuf.Empty>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^GameServerDeploymentsServiceClient this ^java.lang.String name]
    (-> this (.deleteGameServerDeploymentAsync name))))

(defn start-rollout-callable
  "Starts rollout of this game server deployment based on the given game server template.

   Sample code:



   try (GameServerDeploymentsServiceClient gameServerDeploymentsServiceClient = GameServerDeploymentsServiceClient.create()) {
     String formattedName = GameServerDeploymentsServiceClient.formatGameServerDeploymentName(\"[PROJECT]\", \"[LOCATION]\", \"[GAME_SERVER_DEPLOYMENT]\");
     GameServerTemplate newGameServerTemplate = GameServerTemplate.newBuilder().build();
     StartRolloutRequest request = StartRolloutRequest.newBuilder()
       .setName(formattedName)
       .setNewGameServerTemplate(newGameServerTemplate)
       .build();
     ApiFuture<Operation> future = gameServerDeploymentsServiceClient.startRolloutCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.StartRolloutRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GameServerDeploymentsServiceClient this]
    (-> this (.startRolloutCallable))))

(defn start-rollout-operation-callable
  "Starts rollout of this game server deployment based on the given game server template.

   Sample code:



   try (GameServerDeploymentsServiceClient gameServerDeploymentsServiceClient = GameServerDeploymentsServiceClient.create()) {
     String formattedName = GameServerDeploymentsServiceClient.formatGameServerDeploymentName(\"[PROJECT]\", \"[LOCATION]\", \"[GAME_SERVER_DEPLOYMENT]\");
     GameServerTemplate newGameServerTemplate = GameServerTemplate.newBuilder().build();
     StartRolloutRequest request = StartRolloutRequest.newBuilder()
       .setName(formattedName)
       .setNewGameServerTemplate(newGameServerTemplate)
       .build();
     OperationFuture<GameServerDeployment, Empty> future = gameServerDeploymentsServiceClient.startRolloutOperationCallable().futureCall(request);
     // Do something
     GameServerDeployment response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.StartRolloutRequest,com.google.cloud.gaming.v1alpha.GameServerDeployment,com.google.protobuf.Empty>`"
  ([^GameServerDeploymentsServiceClient this]
    (-> this (.startRolloutOperationCallable))))

(defn commit-rollout-callable
  "Commits the ongoing game server deployment rollout by setting the rollout percentage to 100 in
   all clusters whose labels match labels in the game server template.

   Sample code:



   try (GameServerDeploymentsServiceClient gameServerDeploymentsServiceClient = GameServerDeploymentsServiceClient.create()) {
     String formattedName = GameServerDeploymentsServiceClient.formatGameServerDeploymentName(\"[PROJECT]\", \"[LOCATION]\", \"[GAME_SERVER_DEPLOYMENT]\");
     CommitRolloutRequest request = CommitRolloutRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<Operation> future = gameServerDeploymentsServiceClient.commitRolloutCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.CommitRolloutRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GameServerDeploymentsServiceClient this]
    (-> this (.commitRolloutCallable))))

(defn commit-rollout-async
  "Commits the ongoing game server deployment rollout by setting the rollout percentage to 100 in
   all clusters whose labels match labels in the game server template.

   Sample code:



   try (GameServerDeploymentsServiceClient gameServerDeploymentsServiceClient = GameServerDeploymentsServiceClient.create()) {
     String formattedName = GameServerDeploymentsServiceClient.formatGameServerDeploymentName(\"[PROJECT]\", \"[LOCATION]\", \"[GAME_SERVER_DEPLOYMENT]\");
     GameServerDeployment response = gameServerDeploymentsServiceClient.commitRolloutAsync(formattedName).get();
   }

  name - Required. The name of the game server deployment, using the form: `projects/{project_id}/locations/{location}/gameServerDeployments/{deployment_id}` - `java.lang.String`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.gaming.v1alpha.GameServerDeployment,com.google.protobuf.Empty>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^GameServerDeploymentsServiceClient this ^java.lang.String name]
    (-> this (.commitRolloutAsync name))))

(defn revert-rollout-operation-callable
  "Rolls back the ongoing game server deployment rollout by setting the rollout percentage to 0 in
   all clusters whose labels match labels in the game server template.

   Sample code:



   try (GameServerDeploymentsServiceClient gameServerDeploymentsServiceClient = GameServerDeploymentsServiceClient.create()) {
     String formattedName = GameServerDeploymentsServiceClient.formatGameServerDeploymentName(\"[PROJECT]\", \"[LOCATION]\", \"[GAME_SERVER_DEPLOYMENT]\");
     RevertRolloutRequest request = RevertRolloutRequest.newBuilder()
       .setName(formattedName)
       .build();
     OperationFuture<GameServerDeployment, Empty> future = gameServerDeploymentsServiceClient.revertRolloutOperationCallable().futureCall(request);
     // Do something
     GameServerDeployment response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.RevertRolloutRequest,com.google.cloud.gaming.v1alpha.GameServerDeployment,com.google.protobuf.Empty>`"
  ([^GameServerDeploymentsServiceClient this]
    (-> this (.revertRolloutOperationCallable))))

(defn start-rollout-async
  "Starts rollout of this game server deployment based on the given game server template.

   Sample code:



   try (GameServerDeploymentsServiceClient gameServerDeploymentsServiceClient = GameServerDeploymentsServiceClient.create()) {
     String formattedName = GameServerDeploymentsServiceClient.formatGameServerDeploymentName(\"[PROJECT]\", \"[LOCATION]\", \"[GAME_SERVER_DEPLOYMENT]\");
     GameServerTemplate newGameServerTemplate = GameServerTemplate.newBuilder().build();
     GameServerDeployment response = gameServerDeploymentsServiceClient.startRolloutAsync(formattedName, newGameServerTemplate).get();
   }

  name - Required. The name of the game server deployment, using the form: `projects/{project_id}/locations/{location}/gameServerDeployments/{deployment_id}` - `java.lang.String`
  new-game-server-template - Required. The game server template for the new rollout. - `com.google.cloud.gaming.v1alpha.GameServerTemplate`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.gaming.v1alpha.GameServerDeployment,com.google.protobuf.Empty>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^GameServerDeploymentsServiceClient this ^java.lang.String name ^com.google.cloud.gaming.v1alpha.GameServerTemplate new-game-server-template]
    (-> this (.startRolloutAsync name new-game-server-template)))
  ([^GameServerDeploymentsServiceClient this ^com.google.cloud.gaming.v1alpha.StartRolloutRequest request]
    (-> this (.startRolloutAsync request))))

(defn shutdown-now
  ""
  ([^GameServerDeploymentsServiceClient this]
    (-> this (.shutdownNow))))

(defn revert-rollout-callable
  "Rolls back the ongoing game server deployment rollout by setting the rollout percentage to 0 in
   all clusters whose labels match labels in the game server template.

   Sample code:



   try (GameServerDeploymentsServiceClient gameServerDeploymentsServiceClient = GameServerDeploymentsServiceClient.create()) {
     String formattedName = GameServerDeploymentsServiceClient.formatGameServerDeploymentName(\"[PROJECT]\", \"[LOCATION]\", \"[GAME_SERVER_DEPLOYMENT]\");
     RevertRolloutRequest request = RevertRolloutRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<Operation> future = gameServerDeploymentsServiceClient.revertRolloutCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.RevertRolloutRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GameServerDeploymentsServiceClient this]
    (-> this (.revertRolloutCallable))))

