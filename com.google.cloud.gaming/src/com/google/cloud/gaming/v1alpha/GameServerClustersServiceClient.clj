(ns com.google.cloud.gaming.v1alpha.GameServerClustersServiceClient
  "Service Description: The game server cluster is used to capture the game server cluster's
  settings which are used to manage game server clusters.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (GameServerClustersServiceClient gameServerClustersServiceClient = GameServerClustersServiceClient.create()) {
    String formattedName = GameServerClustersServiceClient.formatGameServerClusterName(\"[PROJECT]\", \"[LOCATION]\", \"[REALM]\", \"[GAME_SERVER_CLUSTER]\");
    GameServerCluster response = gameServerClustersServiceClient.getGameServerCluster(formattedName);
  }

  Note: close() needs to be called on the gameServerClustersServiceClient object to clean up
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
  GameServerClustersServiceSettings to create(). For example:

  To customize credentials:



  GameServerClustersServiceSettings gameServerClustersServiceSettings =
      GameServerClustersServiceSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  GameServerClustersServiceClient gameServerClustersServiceClient =
      GameServerClustersServiceClient.create(gameServerClustersServiceSettings);

  To customize the endpoint:



  GameServerClustersServiceSettings gameServerClustersServiceSettings =
      GameServerClustersServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
  GameServerClustersServiceClient gameServerClustersServiceClient =
      GameServerClustersServiceClient.create(gameServerClustersServiceSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.gaming.v1alpha GameServerClustersServiceClient]))

(defn *parse-location-from-realm-name
  "Deprecated. Use the RealmName class instead.

  realm-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String realm-name]
    (GameServerClustersServiceClient/parseLocationFromRealmName realm-name)))

(defn *parse-project-from-realm-name
  "Deprecated. Use the RealmName class instead.

  realm-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String realm-name]
    (GameServerClustersServiceClient/parseProjectFromRealmName realm-name)))

(defn *format-realm-name
  "Deprecated. Use the RealmName class instead.

  project - `java.lang.String`
  location - `java.lang.String`
  realm - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String location ^java.lang.String realm]
    (GameServerClustersServiceClient/formatRealmName project location realm)))

(defn *parse-realm-from-game-server-cluster-name
  "Deprecated. Use the GameServerClusterName class instead.

  game-server-cluster-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String game-server-cluster-name]
    (GameServerClustersServiceClient/parseRealmFromGameServerClusterName game-server-cluster-name)))

(defn *format-game-server-cluster-name
  "Deprecated. Use the GameServerClusterName class instead.

  project - `java.lang.String`
  location - `java.lang.String`
  realm - `java.lang.String`
  game-server-cluster - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String location ^java.lang.String realm ^java.lang.String game-server-cluster]
    (GameServerClustersServiceClient/formatGameServerClusterName project location realm game-server-cluster)))

(defn *parse-location-from-game-server-cluster-name
  "Deprecated. Use the GameServerClusterName class instead.

  game-server-cluster-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String game-server-cluster-name]
    (GameServerClustersServiceClient/parseLocationFromGameServerClusterName game-server-cluster-name)))

(defn *parse-game-server-cluster-from-game-server-cluster-name
  "Deprecated. Use the GameServerClusterName class instead.

  game-server-cluster-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String game-server-cluster-name]
    (GameServerClustersServiceClient/parseGameServerClusterFromGameServerClusterName game-server-cluster-name)))

(defn *create
  "Constructs an instance of GameServerClustersServiceClient, using the given settings. The
   channels are created based on the settings passed in, or defaults for any settings that are not
   set.

  settings - `com.google.cloud.gaming.v1alpha.GameServerClustersServiceSettings`

  returns: `com.google.cloud.gaming.v1alpha.GameServerClustersServiceClient`

  throws: java.io.IOException"
  (^com.google.cloud.gaming.v1alpha.GameServerClustersServiceClient [^com.google.cloud.gaming.v1alpha.GameServerClustersServiceSettings settings]
    (GameServerClustersServiceClient/create settings))
  (^com.google.cloud.gaming.v1alpha.GameServerClustersServiceClient []
    (GameServerClustersServiceClient/create )))

(defn *parse-project-from-game-server-cluster-name
  "Deprecated. Use the GameServerClusterName class instead.

  game-server-cluster-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String game-server-cluster-name]
    (GameServerClustersServiceClient/parseProjectFromGameServerClusterName game-server-cluster-name)))

(defn *parse-realm-from-realm-name
  "Deprecated. Use the RealmName class instead.

  realm-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String realm-name]
    (GameServerClustersServiceClient/parseRealmFromRealmName realm-name)))

(defn list-game-server-clusters-paged-callable
  "Lists game server clusters in a given project and location.

   Sample code:



   try (GameServerClustersServiceClient gameServerClustersServiceClient = GameServerClustersServiceClient.create()) {
     String formattedParent = GameServerClustersServiceClient.formatRealmName(\"[PROJECT]\", \"[LOCATION]\", \"[REALM]\");
     ListGameServerClustersRequest request = ListGameServerClustersRequest.newBuilder()
       .setParent(formattedParent)
       .build();
     ApiFuture<ListGameServerClustersPagedResponse> future = gameServerClustersServiceClient.listGameServerClustersPagedCallable().futureCall(request);
     // Do something
     for (GameServerCluster element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.ListGameServerClustersRequest,com.google.cloud.gaming.v1alpha.GameServerClustersServiceClient$ListGameServerClustersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GameServerClustersServiceClient this]
    (-> this (.listGameServerClustersPagedCallable))))

(defn create-game-server-cluster-async
  "Creates a new game server cluster in a given project and location.

   Sample code:



   try (GameServerClustersServiceClient gameServerClustersServiceClient = GameServerClustersServiceClient.create()) {
     String formattedParent = GameServerClustersServiceClient.formatRealmName(\"[PROJECT]\", \"[LOCATION]\", \"[REALM]\");
     String gameServerClusterId = \"\";
     GameServerCluster gameServerCluster = GameServerCluster.newBuilder().build();
     GameServerCluster response = gameServerClustersServiceClient.createGameServerClusterAsync(formattedParent, gameServerClusterId, gameServerCluster).get();
   }

  parent - Required. The parent resource name, using the form: `projects/{project_id}/locations/{location}/realms/{realm-id}`. - `java.lang.String`
  game-server-cluster-id - Required. The ID of the game server cluster resource to be created. - `java.lang.String`
  game-server-cluster - Required. The game server cluster resource to be created. - `com.google.cloud.gaming.v1alpha.GameServerCluster`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.gaming.v1alpha.GameServerCluster,com.google.protobuf.Empty>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^GameServerClustersServiceClient this ^java.lang.String parent ^java.lang.String game-server-cluster-id ^com.google.cloud.gaming.v1alpha.GameServerCluster game-server-cluster]
    (-> this (.createGameServerClusterAsync parent game-server-cluster-id game-server-cluster)))
  ([^GameServerClustersServiceClient this ^com.google.cloud.gaming.v1alpha.CreateGameServerClusterRequest request]
    (-> this (.createGameServerClusterAsync request))))

(defn delete-game-server-cluster-operation-callable
  "Deletes a single game server cluster.

   Sample code:



   try (GameServerClustersServiceClient gameServerClustersServiceClient = GameServerClustersServiceClient.create()) {
     String formattedName = GameServerClustersServiceClient.formatGameServerClusterName(\"[PROJECT]\", \"[LOCATION]\", \"[REALM]\", \"[GAME_SERVER_CLUSTER]\");
     DeleteGameServerClusterRequest request = DeleteGameServerClusterRequest.newBuilder()
       .setName(formattedName)
       .build();
     OperationFuture<Empty, Empty> future = gameServerClustersServiceClient.deleteGameServerClusterOperationCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.DeleteGameServerClusterRequest,com.google.protobuf.Empty,com.google.protobuf.Empty>`"
  ([^GameServerClustersServiceClient this]
    (-> this (.deleteGameServerClusterOperationCallable))))

(defn get-settings
  "returns: `com.google.cloud.gaming.v1alpha.GameServerClustersServiceSettings`"
  (^com.google.cloud.gaming.v1alpha.GameServerClustersServiceSettings [^GameServerClustersServiceClient this]
    (-> this (.getSettings))))

(defn get-game-server-cluster
  "Gets details of a single game server cluster.

   Sample code:



   try (GameServerClustersServiceClient gameServerClustersServiceClient = GameServerClustersServiceClient.create()) {
     String formattedName = GameServerClustersServiceClient.formatGameServerClusterName(\"[PROJECT]\", \"[LOCATION]\", \"[REALM]\", \"[GAME_SERVER_CLUSTER]\");
     GameServerCluster response = gameServerClustersServiceClient.getGameServerCluster(formattedName);
   }

  name - Required. The name of the game server cluster to retrieve, using the form: `projects/{project_id}/locations/{location}/realms/{realm-id}/gameServerClusters/{cluster_id}` - `java.lang.String`

  returns: `com.google.cloud.gaming.v1alpha.GameServerCluster`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.gaming.v1alpha.GameServerCluster [^GameServerClustersServiceClient this ^java.lang.String name]
    (-> this (.getGameServerCluster name))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.gaming.v1alpha.stub.GameServerClustersServiceStub`"
  ([^GameServerClustersServiceClient this]
    (-> this (.getStub))))

(defn delete-game-server-cluster-async
  "Deletes a single game server cluster.

   Sample code:



   try (GameServerClustersServiceClient gameServerClustersServiceClient = GameServerClustersServiceClient.create()) {
     String formattedName = GameServerClustersServiceClient.formatGameServerClusterName(\"[PROJECT]\", \"[LOCATION]\", \"[REALM]\", \"[GAME_SERVER_CLUSTER]\");
     gameServerClustersServiceClient.deleteGameServerClusterAsync(formattedName).get();
   }

  name - Required. The name of the game server cluster to delete, using the form: `projects/{project_id}/locations/{location}/gameServerClusters/{cluster_id}` - `java.lang.String`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.protobuf.Empty,com.google.protobuf.Empty>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^GameServerClustersServiceClient this ^java.lang.String name]
    (-> this (.deleteGameServerClusterAsync name))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GameServerClustersServiceClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GameServerClustersServiceClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GameServerClustersServiceClient this]
    (-> this (.shutdown))))

(defn get-operations-client
  "Returns the OperationsClient that can be used to query the status of a long-running operation
   returned by another API method call.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.longrunning.OperationsClient`"
  ([^GameServerClustersServiceClient this]
    (-> this (.getOperationsClient))))

(defn delete-game-server-cluster-callable
  "Deletes a single game server cluster.

   Sample code:



   try (GameServerClustersServiceClient gameServerClustersServiceClient = GameServerClustersServiceClient.create()) {
     String formattedName = GameServerClustersServiceClient.formatGameServerClusterName(\"[PROJECT]\", \"[LOCATION]\", \"[REALM]\", \"[GAME_SERVER_CLUSTER]\");
     DeleteGameServerClusterRequest request = DeleteGameServerClusterRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<Operation> future = gameServerClustersServiceClient.deleteGameServerClusterCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.DeleteGameServerClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GameServerClustersServiceClient this]
    (-> this (.deleteGameServerClusterCallable))))

(defn list-game-server-clusters
  "Lists game server clusters in a given project and location.

   Sample code:



   try (GameServerClustersServiceClient gameServerClustersServiceClient = GameServerClustersServiceClient.create()) {
     String formattedParent = GameServerClustersServiceClient.formatRealmName(\"[PROJECT]\", \"[LOCATION]\", \"[REALM]\");
     for (GameServerCluster element : gameServerClustersServiceClient.listGameServerClusters(formattedParent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The parent resource name, using the form: \"projects/{project_id}/locations/{location}/realms/{realm-id}\". - `java.lang.String`

  returns: `com.google.cloud.gaming.v1alpha.GameServerClustersServiceClient$ListGameServerClustersPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.gaming.v1alpha.GameServerClustersServiceClient$ListGameServerClustersPagedResponse [^GameServerClustersServiceClient this ^java.lang.String parent]
    (-> this (.listGameServerClusters parent))))

(defn close
  ""
  ([^GameServerClustersServiceClient this]
    (-> this (.close))))

(defn create-game-server-cluster-operation-callable
  "Creates a new game server cluster in a given project and location.

   Sample code:



   try (GameServerClustersServiceClient gameServerClustersServiceClient = GameServerClustersServiceClient.create()) {
     String formattedParent = GameServerClustersServiceClient.formatRealmName(\"[PROJECT]\", \"[LOCATION]\", \"[REALM]\");
     String gameServerClusterId = \"\";
     GameServerCluster gameServerCluster = GameServerCluster.newBuilder().build();
     CreateGameServerClusterRequest request = CreateGameServerClusterRequest.newBuilder()
       .setParent(formattedParent)
       .setGameServerClusterId(gameServerClusterId)
       .setGameServerCluster(gameServerCluster)
       .build();
     OperationFuture<GameServerCluster, Empty> future = gameServerClustersServiceClient.createGameServerClusterOperationCallable().futureCall(request);
     // Do something
     GameServerCluster response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.CreateGameServerClusterRequest,com.google.cloud.gaming.v1alpha.GameServerCluster,com.google.protobuf.Empty>`"
  ([^GameServerClustersServiceClient this]
    (-> this (.createGameServerClusterOperationCallable))))

(defn create-game-server-cluster-callable
  "Creates a new game server cluster in a given project and location.

   Sample code:



   try (GameServerClustersServiceClient gameServerClustersServiceClient = GameServerClustersServiceClient.create()) {
     String formattedParent = GameServerClustersServiceClient.formatRealmName(\"[PROJECT]\", \"[LOCATION]\", \"[REALM]\");
     String gameServerClusterId = \"\";
     GameServerCluster gameServerCluster = GameServerCluster.newBuilder().build();
     CreateGameServerClusterRequest request = CreateGameServerClusterRequest.newBuilder()
       .setParent(formattedParent)
       .setGameServerClusterId(gameServerClusterId)
       .setGameServerCluster(gameServerCluster)
       .build();
     ApiFuture<Operation> future = gameServerClustersServiceClient.createGameServerClusterCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.CreateGameServerClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GameServerClustersServiceClient this]
    (-> this (.createGameServerClusterCallable))))

(defn list-game-server-clusters-callable
  "Lists game server clusters in a given project and location.

   Sample code:



   try (GameServerClustersServiceClient gameServerClustersServiceClient = GameServerClustersServiceClient.create()) {
     String formattedParent = GameServerClustersServiceClient.formatRealmName(\"[PROJECT]\", \"[LOCATION]\", \"[REALM]\");
     ListGameServerClustersRequest request = ListGameServerClustersRequest.newBuilder()
       .setParent(formattedParent)
       .build();
     while (true) {
       ListGameServerClustersResponse response = gameServerClustersServiceClient.listGameServerClustersCallable().call(request);
       for (GameServerCluster element : response.getGameServerClustersList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.ListGameServerClustersRequest,com.google.cloud.gaming.v1alpha.ListGameServerClustersResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GameServerClustersServiceClient this]
    (-> this (.listGameServerClustersCallable))))

(defn update-game-server-cluster-async
  "Patches a single game server cluster.

   Sample code:



   try (GameServerClustersServiceClient gameServerClustersServiceClient = GameServerClustersServiceClient.create()) {
     GameServerCluster gameServerCluster = GameServerCluster.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     GameServerCluster response = gameServerClustersServiceClient.updateGameServerClusterAsync(gameServerCluster, updateMask).get();
   }

  game-server-cluster - Required. The game server cluster to be updated. Only fields specified in update_mask are updated. - `com.google.cloud.gaming.v1alpha.GameServerCluster`
  update-mask - Required. Mask of fields to update. At least one path must be supplied in this field. For the `FieldMask` definition, see https: //developers.google.com/protocol-buffers // /docs/reference/google.protobuf#fieldmask - `com.google.protobuf.FieldMask`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.gaming.v1alpha.GameServerCluster,com.google.protobuf.Empty>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^GameServerClustersServiceClient this ^com.google.cloud.gaming.v1alpha.GameServerCluster game-server-cluster ^com.google.protobuf.FieldMask update-mask]
    (-> this (.updateGameServerClusterAsync game-server-cluster update-mask)))
  ([^GameServerClustersServiceClient this ^com.google.cloud.gaming.v1alpha.UpdateGameServerClusterRequest request]
    (-> this (.updateGameServerClusterAsync request))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GameServerClustersServiceClient this]
    (-> this (.isTerminated))))

(defn get-game-server-cluster-callable
  "Gets details of a single game server cluster.

   Sample code:



   try (GameServerClustersServiceClient gameServerClustersServiceClient = GameServerClustersServiceClient.create()) {
     String formattedName = GameServerClustersServiceClient.formatGameServerClusterName(\"[PROJECT]\", \"[LOCATION]\", \"[REALM]\", \"[GAME_SERVER_CLUSTER]\");
     GetGameServerClusterRequest request = GetGameServerClusterRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<GameServerCluster> future = gameServerClustersServiceClient.getGameServerClusterCallable().futureCall(request);
     // Do something
     GameServerCluster response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.GetGameServerClusterRequest,com.google.cloud.gaming.v1alpha.GameServerCluster>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GameServerClustersServiceClient this]
    (-> this (.getGameServerClusterCallable))))

(defn update-game-server-cluster-callable
  "Patches a single game server cluster.

   Sample code:



   try (GameServerClustersServiceClient gameServerClustersServiceClient = GameServerClustersServiceClient.create()) {
     GameServerCluster gameServerCluster = GameServerCluster.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     UpdateGameServerClusterRequest request = UpdateGameServerClusterRequest.newBuilder()
       .setGameServerCluster(gameServerCluster)
       .setUpdateMask(updateMask)
       .build();
     ApiFuture<Operation> future = gameServerClustersServiceClient.updateGameServerClusterCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.UpdateGameServerClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GameServerClustersServiceClient this]
    (-> this (.updateGameServerClusterCallable))))

(defn shutdown-now
  ""
  ([^GameServerClustersServiceClient this]
    (-> this (.shutdownNow))))

(defn update-game-server-cluster-operation-callable
  "Patches a single game server cluster.

   Sample code:



   try (GameServerClustersServiceClient gameServerClustersServiceClient = GameServerClustersServiceClient.create()) {
     GameServerCluster gameServerCluster = GameServerCluster.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     UpdateGameServerClusterRequest request = UpdateGameServerClusterRequest.newBuilder()
       .setGameServerCluster(gameServerCluster)
       .setUpdateMask(updateMask)
       .build();
     OperationFuture<GameServerCluster, Empty> future = gameServerClustersServiceClient.updateGameServerClusterOperationCallable().futureCall(request);
     // Do something
     GameServerCluster response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.UpdateGameServerClusterRequest,com.google.cloud.gaming.v1alpha.GameServerCluster,com.google.protobuf.Empty>`"
  ([^GameServerClustersServiceClient this]
    (-> this (.updateGameServerClusterOperationCallable))))

