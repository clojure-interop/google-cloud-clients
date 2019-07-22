(ns com.google.cloud.gaming.v1alpha.RealmsServiceClient
  "Service Description: Realm provides grouping of game server clusters that are serving particular
  gamer population.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (RealmsServiceClient realmsServiceClient = RealmsServiceClient.create()) {
    String formattedName = RealmsServiceClient.formatRealmName(\"[PROJECT]\", \"[LOCATION]\", \"[REALM]\");
    Realm response = realmsServiceClient.getRealm(formattedName);
  }

  Note: close() needs to be called on the realmsServiceClient object to clean up resources such
  as threads. In the example above, try-with-resources is used, which automatically calls close().

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

  This class can be customized by passing in a custom instance of RealmsServiceSettings to
  create(). For example:

  To customize credentials:



  RealmsServiceSettings realmsServiceSettings =
      RealmsServiceSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  RealmsServiceClient realmsServiceClient =
      RealmsServiceClient.create(realmsServiceSettings);

  To customize the endpoint:



  RealmsServiceSettings realmsServiceSettings =
      RealmsServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
  RealmsServiceClient realmsServiceClient =
      RealmsServiceClient.create(realmsServiceSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.gaming.v1alpha RealmsServiceClient]))

(defn *format-location-name
  "Deprecated. Use the LocationName class instead.

  project - `java.lang.String`
  location - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String location]
    (RealmsServiceClient/formatLocationName project location)))

(defn *format-realm-name
  "Deprecated. Use the RealmName class instead.

  project - `java.lang.String`
  location - `java.lang.String`
  realm - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String location ^java.lang.String realm]
    (RealmsServiceClient/formatRealmName project location realm)))

(defn *parse-project-from-location-name
  "Deprecated. Use the LocationName class instead.

  location-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String location-name]
    (RealmsServiceClient/parseProjectFromLocationName location-name)))

(defn *parse-location-from-location-name
  "Deprecated. Use the LocationName class instead.

  location-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String location-name]
    (RealmsServiceClient/parseLocationFromLocationName location-name)))

(defn *parse-project-from-realm-name
  "Deprecated. Use the RealmName class instead.

  realm-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String realm-name]
    (RealmsServiceClient/parseProjectFromRealmName realm-name)))

(defn *parse-location-from-realm-name
  "Deprecated. Use the RealmName class instead.

  realm-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String realm-name]
    (RealmsServiceClient/parseLocationFromRealmName realm-name)))

(defn *parse-realm-from-realm-name
  "Deprecated. Use the RealmName class instead.

  realm-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String realm-name]
    (RealmsServiceClient/parseRealmFromRealmName realm-name)))

(defn *create
  "Constructs an instance of RealmsServiceClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.gaming.v1alpha.RealmsServiceSettings`

  returns: `com.google.cloud.gaming.v1alpha.RealmsServiceClient`

  throws: java.io.IOException"
  (^com.google.cloud.gaming.v1alpha.RealmsServiceClient [^com.google.cloud.gaming.v1alpha.RealmsServiceSettings settings]
    (RealmsServiceClient/create settings))
  (^com.google.cloud.gaming.v1alpha.RealmsServiceClient []
    (RealmsServiceClient/create )))

(defn delete-realm-operation-callable
  "Deletes a single realm.

   Sample code:



   try (RealmsServiceClient realmsServiceClient = RealmsServiceClient.create()) {
     String formattedName = RealmsServiceClient.formatRealmName(\"[PROJECT]\", \"[LOCATION]\", \"[REALM]\");
     DeleteRealmRequest request = DeleteRealmRequest.newBuilder()
       .setName(formattedName)
       .build();
     OperationFuture<Empty, Empty> future = realmsServiceClient.deleteRealmOperationCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.DeleteRealmRequest,com.google.protobuf.Empty,com.google.protobuf.Empty>`"
  ([^RealmsServiceClient this]
    (-> this (.deleteRealmOperationCallable))))

(defn create-realm-async
  "Creates a new Realm in a given project and location.

   Sample code:



   try (RealmsServiceClient realmsServiceClient = RealmsServiceClient.create()) {
     String formattedParent = RealmsServiceClient.formatLocationName(\"[PROJECT]\", \"[LOCATION]\");
     String realmId = \"\";
     Realm realm = Realm.newBuilder().build();
     Realm response = realmsServiceClient.createRealmAsync(formattedParent, realmId, realm).get();
   }

  parent - Required. The parent resource name, using the form: `projects/{project_id}/locations/{location}`. - `java.lang.String`
  realm-id - Required. The ID of the realm resource to be created. - `java.lang.String`
  realm - Required. The realm resource to be created. - `com.google.cloud.gaming.v1alpha.Realm`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.gaming.v1alpha.Realm,com.google.protobuf.Empty>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^RealmsServiceClient this ^java.lang.String parent ^java.lang.String realm-id ^com.google.cloud.gaming.v1alpha.Realm realm]
    (-> this (.createRealmAsync parent realm-id realm)))
  ([^RealmsServiceClient this ^com.google.cloud.gaming.v1alpha.CreateRealmRequest request]
    (-> this (.createRealmAsync request))))

(defn update-realm-operation-callable
  "Patches a single Realm.

   Sample code:



   try (RealmsServiceClient realmsServiceClient = RealmsServiceClient.create()) {
     Realm realm = Realm.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     UpdateRealmRequest request = UpdateRealmRequest.newBuilder()
       .setRealm(realm)
       .setUpdateMask(updateMask)
       .build();
     OperationFuture<Realm, Empty> future = realmsServiceClient.updateRealmOperationCallable().futureCall(request);
     // Do something
     Realm response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.UpdateRealmRequest,com.google.cloud.gaming.v1alpha.Realm,com.google.protobuf.Empty>`"
  ([^RealmsServiceClient this]
    (-> this (.updateRealmOperationCallable))))

(defn delete-realm-callable
  "Deletes a single realm.

   Sample code:



   try (RealmsServiceClient realmsServiceClient = RealmsServiceClient.create()) {
     String formattedName = RealmsServiceClient.formatRealmName(\"[PROJECT]\", \"[LOCATION]\", \"[REALM]\");
     DeleteRealmRequest request = DeleteRealmRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<Operation> future = realmsServiceClient.deleteRealmCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.DeleteRealmRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RealmsServiceClient this]
    (-> this (.deleteRealmCallable))))

(defn list-realms
  "Lists realms in a given project and location.

   Sample code:



   try (RealmsServiceClient realmsServiceClient = RealmsServiceClient.create()) {
     String formattedParent = RealmsServiceClient.formatLocationName(\"[PROJECT]\", \"[LOCATION]\");
     for (Realm element : realmsServiceClient.listRealms(formattedParent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The parent resource name, using the form: `projects/{project_id}/locations/{location}`. - `java.lang.String`

  returns: `com.google.cloud.gaming.v1alpha.RealmsServiceClient$ListRealmsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.gaming.v1alpha.RealmsServiceClient$ListRealmsPagedResponse [^RealmsServiceClient this ^java.lang.String parent]
    (-> this (.listRealms parent))))

(defn create-realm-callable
  "Creates a new Realm in a given project and location.

   Sample code:



   try (RealmsServiceClient realmsServiceClient = RealmsServiceClient.create()) {
     String formattedParent = RealmsServiceClient.formatLocationName(\"[PROJECT]\", \"[LOCATION]\");
     String realmId = \"\";
     Realm realm = Realm.newBuilder().build();
     CreateRealmRequest request = CreateRealmRequest.newBuilder()
       .setParent(formattedParent)
       .setRealmId(realmId)
       .setRealm(realm)
       .build();
     ApiFuture<Operation> future = realmsServiceClient.createRealmCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.CreateRealmRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RealmsServiceClient this]
    (-> this (.createRealmCallable))))

(defn delete-realm-async
  "Deletes a single realm.

   Sample code:



   try (RealmsServiceClient realmsServiceClient = RealmsServiceClient.create()) {
     String formattedName = RealmsServiceClient.formatRealmName(\"[PROJECT]\", \"[LOCATION]\", \"[REALM]\");
     realmsServiceClient.deleteRealmAsync(formattedName).get();
   }

  name - Required. The name of the realm to delete, using the form: `projects/{project_id}/locations/{location}/realms/{realm_id}` - `java.lang.String`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.protobuf.Empty,com.google.protobuf.Empty>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^RealmsServiceClient this ^java.lang.String name]
    (-> this (.deleteRealmAsync name))))

(defn get-settings
  "returns: `com.google.cloud.gaming.v1alpha.RealmsServiceSettings`"
  (^com.google.cloud.gaming.v1alpha.RealmsServiceSettings [^RealmsServiceClient this]
    (-> this (.getSettings))))

(defn list-realms-callable
  "Lists realms in a given project and location.

   Sample code:



   try (RealmsServiceClient realmsServiceClient = RealmsServiceClient.create()) {
     String formattedParent = RealmsServiceClient.formatLocationName(\"[PROJECT]\", \"[LOCATION]\");
     ListRealmsRequest request = ListRealmsRequest.newBuilder()
       .setParent(formattedParent)
       .build();
     while (true) {
       ListRealmsResponse response = realmsServiceClient.listRealmsCallable().call(request);
       for (Realm element : response.getRealmsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.ListRealmsRequest,com.google.cloud.gaming.v1alpha.ListRealmsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RealmsServiceClient this]
    (-> this (.listRealmsCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.gaming.v1alpha.stub.RealmsServiceStub`"
  ([^RealmsServiceClient this]
    (-> this (.getStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^RealmsServiceClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^RealmsServiceClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn list-realms-paged-callable
  "Lists realms in a given project and location.

   Sample code:



   try (RealmsServiceClient realmsServiceClient = RealmsServiceClient.create()) {
     String formattedParent = RealmsServiceClient.formatLocationName(\"[PROJECT]\", \"[LOCATION]\");
     ListRealmsRequest request = ListRealmsRequest.newBuilder()
       .setParent(formattedParent)
       .build();
     ApiFuture<ListRealmsPagedResponse> future = realmsServiceClient.listRealmsPagedCallable().futureCall(request);
     // Do something
     for (Realm element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.ListRealmsRequest,com.google.cloud.gaming.v1alpha.RealmsServiceClient$ListRealmsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RealmsServiceClient this]
    (-> this (.listRealmsPagedCallable))))

(defn shutdown
  ""
  ([^RealmsServiceClient this]
    (-> this (.shutdown))))

(defn update-realm-callable
  "Patches a single Realm.

   Sample code:



   try (RealmsServiceClient realmsServiceClient = RealmsServiceClient.create()) {
     Realm realm = Realm.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     UpdateRealmRequest request = UpdateRealmRequest.newBuilder()
       .setRealm(realm)
       .setUpdateMask(updateMask)
       .build();
     ApiFuture<Operation> future = realmsServiceClient.updateRealmCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.UpdateRealmRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RealmsServiceClient this]
    (-> this (.updateRealmCallable))))

(defn create-realm-operation-callable
  "Creates a new Realm in a given project and location.

   Sample code:



   try (RealmsServiceClient realmsServiceClient = RealmsServiceClient.create()) {
     String formattedParent = RealmsServiceClient.formatLocationName(\"[PROJECT]\", \"[LOCATION]\");
     String realmId = \"\";
     Realm realm = Realm.newBuilder().build();
     CreateRealmRequest request = CreateRealmRequest.newBuilder()
       .setParent(formattedParent)
       .setRealmId(realmId)
       .setRealm(realm)
       .build();
     OperationFuture<Realm, Empty> future = realmsServiceClient.createRealmOperationCallable().futureCall(request);
     // Do something
     Realm response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.gaming.v1alpha.CreateRealmRequest,com.google.cloud.gaming.v1alpha.Realm,com.google.protobuf.Empty>`"
  ([^RealmsServiceClient this]
    (-> this (.createRealmOperationCallable))))

(defn get-realm
  "Gets details of a single realm.

   Sample code:



   try (RealmsServiceClient realmsServiceClient = RealmsServiceClient.create()) {
     String formattedName = RealmsServiceClient.formatRealmName(\"[PROJECT]\", \"[LOCATION]\", \"[REALM]\");
     Realm response = realmsServiceClient.getRealm(formattedName);
   }

  name - Required. The name of the realm to retrieve, using the form: `projects/{project_id}/locations/{location}/realms/{realm_id}` - `java.lang.String`

  returns: `com.google.cloud.gaming.v1alpha.Realm`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.gaming.v1alpha.Realm [^RealmsServiceClient this ^java.lang.String name]
    (-> this (.getRealm name))))

(defn get-operations-client
  "Returns the OperationsClient that can be used to query the status of a long-running operation
   returned by another API method call.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.longrunning.OperationsClient`"
  ([^RealmsServiceClient this]
    (-> this (.getOperationsClient))))

(defn close
  ""
  ([^RealmsServiceClient this]
    (-> this (.close))))

(defn get-realm-callable
  "Gets details of a single realm.

   Sample code:



   try (RealmsServiceClient realmsServiceClient = RealmsServiceClient.create()) {
     String formattedName = RealmsServiceClient.formatRealmName(\"[PROJECT]\", \"[LOCATION]\", \"[REALM]\");
     GetRealmRequest request = GetRealmRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<Realm> future = realmsServiceClient.getRealmCallable().futureCall(request);
     // Do something
     Realm response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.gaming.v1alpha.GetRealmRequest,com.google.cloud.gaming.v1alpha.Realm>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RealmsServiceClient this]
    (-> this (.getRealmCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^RealmsServiceClient this]
    (-> this (.isTerminated))))

(defn update-realm-async
  "Patches a single Realm.

   Sample code:



   try (RealmsServiceClient realmsServiceClient = RealmsServiceClient.create()) {
     Realm realm = Realm.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     Realm response = realmsServiceClient.updateRealmAsync(realm, updateMask).get();
   }

  realm - Required. The realm to be updated. Only fields specified in update_mask are updated. - `com.google.cloud.gaming.v1alpha.Realm`
  update-mask - Required. The update mask applies to the resource. For the `FieldMask` definition, see https: //developers.google.com/protocol-buffers // /docs/reference/google.protobuf#fieldmask - `com.google.protobuf.FieldMask`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.gaming.v1alpha.Realm,com.google.protobuf.Empty>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^RealmsServiceClient this ^com.google.cloud.gaming.v1alpha.Realm realm ^com.google.protobuf.FieldMask update-mask]
    (-> this (.updateRealmAsync realm update-mask)))
  ([^RealmsServiceClient this ^com.google.cloud.gaming.v1alpha.UpdateRealmRequest request]
    (-> this (.updateRealmAsync request))))

(defn shutdown-now
  ""
  ([^RealmsServiceClient this]
    (-> this (.shutdownNow))))

