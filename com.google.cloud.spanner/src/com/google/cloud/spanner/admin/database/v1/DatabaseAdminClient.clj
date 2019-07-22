(ns com.google.cloud.spanner.admin.database.v1.DatabaseAdminClient
  "Service Description: Cloud Spanner Database Admin API

  The Cloud Spanner Database Admin API can be used to create, drop, and list databases. It also
  enables updating the schema of pre-existing databases.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
    DatabaseName name = DatabaseName.of(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\");
    Database response = databaseAdminClient.getDatabase(name);
  }

  Note: close() needs to be called on the databaseAdminClient object to clean up resources such
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

  This class can be customized by passing in a custom instance of DatabaseAdminSettings to
  create(). For example:

  To customize credentials:



  DatabaseAdminSettings databaseAdminSettings =
      DatabaseAdminSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  DatabaseAdminClient databaseAdminClient =
      DatabaseAdminClient.create(databaseAdminSettings);

  To customize the endpoint:



  DatabaseAdminSettings databaseAdminSettings =
      DatabaseAdminSettings.newBuilder().setEndpoint(myEndpoint).build();
  DatabaseAdminClient databaseAdminClient =
      DatabaseAdminClient.create(databaseAdminSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner.admin.database.v1 DatabaseAdminClient]))

(defn *create
  "Constructs an instance of DatabaseAdminClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.spanner.admin.database.v1.DatabaseAdminSettings`

  returns: `com.google.cloud.spanner.admin.database.v1.DatabaseAdminClient`

  throws: java.io.IOException"
  (^com.google.cloud.spanner.admin.database.v1.DatabaseAdminClient [^com.google.cloud.spanner.admin.database.v1.DatabaseAdminSettings settings]
    (DatabaseAdminClient/create settings))
  (^com.google.cloud.spanner.admin.database.v1.DatabaseAdminClient []
    (DatabaseAdminClient/create )))

(defn list-databases-callable
  "Lists Cloud Spanner databases.

   Sample code:



   try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
     InstanceName parent = InstanceName.of(\"[PROJECT]\", \"[INSTANCE]\");
     ListDatabasesRequest request = ListDatabasesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListDatabasesResponse response = databaseAdminClient.listDatabasesCallable().call(request);
       for (Database element : response.getDatabasesList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.database.v1.ListDatabasesRequest,com.google.spanner.admin.database.v1.ListDatabasesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DatabaseAdminClient this]
    (-> this (.listDatabasesCallable))))

(defn get-database-callable
  "Gets the state of a Cloud Spanner database.

   Sample code:



   try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
     DatabaseName name = DatabaseName.of(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\");
     GetDatabaseRequest request = GetDatabaseRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Database> future = databaseAdminClient.getDatabaseCallable().futureCall(request);
     // Do something
     Database response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.database.v1.GetDatabaseRequest,com.google.spanner.admin.database.v1.Database>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DatabaseAdminClient this]
    (-> this (.getDatabaseCallable))))

(defn get-iam-policy-callable
  "Gets the access control policy for a database resource. Returns an empty policy if a database
   exists but does not have a policy set.

   Authorization requires `spanner.databases.getIamPolicy` permission on
   [resource][google.iam.v1.GetIamPolicyRequest.resource].

   Sample code:



   try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
     String formattedResource = DatabaseName.format(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\");
     GetIamPolicyRequest request = GetIamPolicyRequest.newBuilder()
       .setResource(formattedResource)
       .build();
     ApiFuture<Policy> future = databaseAdminClient.getIamPolicyCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DatabaseAdminClient this]
    (-> this (.getIamPolicyCallable))))

(defn set-iam-policy
  "Sets the access control policy on a database resource. Replaces any existing policy.

   Authorization requires `spanner.databases.setIamPolicy` permission on
   [resource][google.iam.v1.SetIamPolicyRequest.resource].

   Sample code:



   try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
     String formattedResource = DatabaseName.format(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\");
     Policy policy = Policy.newBuilder().build();
     Policy response = databaseAdminClient.setIamPolicy(formattedResource, policy);
   }

  resource - REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field. - `java.lang.String`
  policy - REQUIRED: The complete policy to be applied to the `resource`. The size of the policy is limited to a few 10s of KB. An empty policy is a valid policy but certain Cloud Platform services (such as Projects) might reject them. - `com.google.iam.v1.Policy`

  returns: `com.google.iam.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.iam.v1.Policy [^DatabaseAdminClient this ^java.lang.String resource ^com.google.iam.v1.Policy policy]
    (-> this (.setIamPolicy resource policy)))
  (^com.google.iam.v1.Policy [^DatabaseAdminClient this ^com.google.iam.v1.SetIamPolicyRequest request]
    (-> this (.setIamPolicy request))))

(defn get-database
  "Gets the state of a Cloud Spanner database.

   Sample code:



   try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
     DatabaseName name = DatabaseName.of(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\");
     Database response = databaseAdminClient.getDatabase(name);
   }

  name - Required. The name of the requested database. Values are of the form `projects/<project>/instances/<instance>/databases/<database>`. - `com.google.spanner.admin.database.v1.DatabaseName`

  returns: `com.google.spanner.admin.database.v1.Database`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.spanner.admin.database.v1.Database [^DatabaseAdminClient this ^com.google.spanner.admin.database.v1.DatabaseName name]
    (-> this (.getDatabase name))))

(defn list-databases
  "Lists Cloud Spanner databases.

   Sample code:



   try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
     InstanceName parent = InstanceName.of(\"[PROJECT]\", \"[INSTANCE]\");
     for (Database element : databaseAdminClient.listDatabases(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The instance whose databases should be listed. Values are of the form `projects/<project>/instances/<instance>`. - `com.google.spanner.admin.database.v1.InstanceName`

  returns: `com.google.cloud.spanner.admin.database.v1.DatabaseAdminClient$ListDatabasesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.spanner.admin.database.v1.DatabaseAdminClient$ListDatabasesPagedResponse [^DatabaseAdminClient this ^com.google.spanner.admin.database.v1.InstanceName parent]
    (-> this (.listDatabases parent))))

(defn get-settings
  "returns: `com.google.cloud.spanner.admin.database.v1.DatabaseAdminSettings`"
  (^com.google.cloud.spanner.admin.database.v1.DatabaseAdminSettings [^DatabaseAdminClient this]
    (-> this (.getSettings))))

(defn list-databases-paged-callable
  "Lists Cloud Spanner databases.

   Sample code:



   try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
     InstanceName parent = InstanceName.of(\"[PROJECT]\", \"[INSTANCE]\");
     ListDatabasesRequest request = ListDatabasesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListDatabasesPagedResponse> future = databaseAdminClient.listDatabasesPagedCallable().futureCall(request);
     // Do something
     for (Database element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.database.v1.ListDatabasesRequest,com.google.cloud.spanner.admin.database.v1.DatabaseAdminClient$ListDatabasesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DatabaseAdminClient this]
    (-> this (.listDatabasesPagedCallable))))

(defn create-database-async
  "Creates a new Cloud Spanner database and starts to prepare it for serving. The returned
   [long-running operation][google.longrunning.Operation] will have a name of the format
   `<database_name>/operations/<operation_id>` and can be used to track preparation of
   the database. The [metadata][google.longrunning.Operation.metadata] field type is
   [CreateDatabaseMetadata][google.spanner.admin.database.v1.CreateDatabaseMetadata]. The
   [response][google.longrunning.Operation.response] field type is
   [Database][google.spanner.admin.database.v1.Database], if successful.

   Sample code:



   try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
     InstanceName parent = InstanceName.of(\"[PROJECT]\", \"[INSTANCE]\");
     String createStatement = \"\";
     Database response = databaseAdminClient.createDatabaseAsync(parent, createStatement).get();
   }

  parent - Required. The name of the instance that will serve the new database. Values are of the form `projects/<project>/instances/<instance>`. - `com.google.spanner.admin.database.v1.InstanceName`
  create-statement - Required. A `CREATE DATABASE` statement, which specifies the ID of the new database. The database ID must conform to the regular expression `[a-z][a-z0-9_\\-]*[a-z0-9]` and be between 2 and 30 characters in length. If the database ID is a reserved word or if it contains a hyphen, the database ID must be enclosed in backticks (`` ` ``). - `java.lang.String`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.spanner.admin.database.v1.Database,com.google.spanner.admin.database.v1.CreateDatabaseMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^DatabaseAdminClient this ^com.google.spanner.admin.database.v1.InstanceName parent ^java.lang.String create-statement]
    (-> this (.createDatabaseAsync parent create-statement)))
  ([^DatabaseAdminClient this ^com.google.spanner.admin.database.v1.CreateDatabaseRequest request]
    (-> this (.createDatabaseAsync request))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.spanner.admin.database.v1.stub.DatabaseAdminStub`"
  ([^DatabaseAdminClient this]
    (-> this (.getStub))))

(defn update-database-ddl-operation-callable
  "Updates the schema of a Cloud Spanner database by creating/altering/dropping tables, columns,
   indexes, etc. The returned [long-running operation][google.longrunning.Operation] will have a
   name of the format `<database_name>/operations/<operation_id>` and can be used to
   track execution of the schema change(s). The [metadata][google.longrunning.Operation.metadata]
   field type is
   [UpdateDatabaseDdlMetadata][google.spanner.admin.database.v1.UpdateDatabaseDdlMetadata]. The
   operation has no response.

   Sample code:



   try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
     DatabaseName database = DatabaseName.of(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\");
     List<String> statements = new ArrayList<>();
     UpdateDatabaseDdlRequest request = UpdateDatabaseDdlRequest.newBuilder()
       .setDatabase(database.toString())
       .addAllStatements(statements)
       .build();
     OperationFuture<Empty, UpdateDatabaseDdlMetadata> future = databaseAdminClient.updateDatabaseDdlOperationCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.spanner.admin.database.v1.UpdateDatabaseDdlRequest,com.google.protobuf.Empty,com.google.spanner.admin.database.v1.UpdateDatabaseDdlMetadata>`"
  ([^DatabaseAdminClient this]
    (-> this (.updateDatabaseDdlOperationCallable))))

(defn update-database-ddl-async
  "Updates the schema of a Cloud Spanner database by creating/altering/dropping tables, columns,
   indexes, etc. The returned [long-running operation][google.longrunning.Operation] will have a
   name of the format `<database_name>/operations/<operation_id>` and can be used to
   track execution of the schema change(s). The [metadata][google.longrunning.Operation.metadata]
   field type is
   [UpdateDatabaseDdlMetadata][google.spanner.admin.database.v1.UpdateDatabaseDdlMetadata]. The
   operation has no response.

   Sample code:



   try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
     DatabaseName database = DatabaseName.of(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\");
     List<String> statements = new ArrayList<>();
     databaseAdminClient.updateDatabaseDdlAsync(database, statements).get();
   }

  database - Required. The database to update. - `com.google.spanner.admin.database.v1.DatabaseName`
  statements - DDL statements to be applied to the database. - `java.util.List`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.protobuf.Empty,com.google.spanner.admin.database.v1.UpdateDatabaseDdlMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^DatabaseAdminClient this ^com.google.spanner.admin.database.v1.DatabaseName database ^java.util.List statements]
    (-> this (.updateDatabaseDdlAsync database statements)))
  ([^DatabaseAdminClient this ^com.google.spanner.admin.database.v1.UpdateDatabaseDdlRequest request]
    (-> this (.updateDatabaseDdlAsync request))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^DatabaseAdminClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^DatabaseAdminClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^DatabaseAdminClient this]
    (-> this (.shutdown))))

(defn create-database-operation-callable
  "Creates a new Cloud Spanner database and starts to prepare it for serving. The returned
   [long-running operation][google.longrunning.Operation] will have a name of the format
   `<database_name>/operations/<operation_id>` and can be used to track preparation of
   the database. The [metadata][google.longrunning.Operation.metadata] field type is
   [CreateDatabaseMetadata][google.spanner.admin.database.v1.CreateDatabaseMetadata]. The
   [response][google.longrunning.Operation.response] field type is
   [Database][google.spanner.admin.database.v1.Database], if successful.

   Sample code:



   try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
     InstanceName parent = InstanceName.of(\"[PROJECT]\", \"[INSTANCE]\");
     String createStatement = \"\";
     CreateDatabaseRequest request = CreateDatabaseRequest.newBuilder()
       .setParent(parent.toString())
       .setCreateStatement(createStatement)
       .build();
     OperationFuture<Database, CreateDatabaseMetadata> future = databaseAdminClient.createDatabaseOperationCallable().futureCall(request);
     // Do something
     Database response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.spanner.admin.database.v1.CreateDatabaseRequest,com.google.spanner.admin.database.v1.Database,com.google.spanner.admin.database.v1.CreateDatabaseMetadata>`"
  ([^DatabaseAdminClient this]
    (-> this (.createDatabaseOperationCallable))))

(defn drop-database-callable
  "Drops (aka deletes) a Cloud Spanner database.

   Sample code:



   try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
     DatabaseName database = DatabaseName.of(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\");
     DropDatabaseRequest request = DropDatabaseRequest.newBuilder()
       .setDatabase(database.toString())
       .build();
     ApiFuture<Void> future = databaseAdminClient.dropDatabaseCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.database.v1.DropDatabaseRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DatabaseAdminClient this]
    (-> this (.dropDatabaseCallable))))

(defn get-operations-client
  "Returns the OperationsClient that can be used to query the status of a long-running operation
   returned by another API method call.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.longrunning.OperationsClient`"
  ([^DatabaseAdminClient this]
    (-> this (.getOperationsClient))))

(defn set-iam-policy-callable
  "Sets the access control policy on a database resource. Replaces any existing policy.

   Authorization requires `spanner.databases.setIamPolicy` permission on
   [resource][google.iam.v1.SetIamPolicyRequest.resource].

   Sample code:



   try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
     String formattedResource = DatabaseName.format(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\");
     Policy policy = Policy.newBuilder().build();
     SetIamPolicyRequest request = SetIamPolicyRequest.newBuilder()
       .setResource(formattedResource)
       .setPolicy(policy)
       .build();
     ApiFuture<Policy> future = databaseAdminClient.setIamPolicyCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DatabaseAdminClient this]
    (-> this (.setIamPolicyCallable))))

(defn close
  ""
  ([^DatabaseAdminClient this]
    (-> this (.close))))

(defn test-iam-permissions-callable
  "Returns permissions that the caller has on the specified database resource.

   Attempting this RPC on a non-existent Cloud Spanner database will result in a NOT_FOUND
   error if the user has `spanner.databases.list` permission on the containing Cloud Spanner
   instance. Otherwise returns an empty set of permissions.

   Sample code:



   try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
     String formattedResource = DatabaseName.format(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\");
     List<String> permissions = new ArrayList<>();
     TestIamPermissionsRequest request = TestIamPermissionsRequest.newBuilder()
       .setResource(formattedResource)
       .addAllPermissions(permissions)
       .build();
     ApiFuture<TestIamPermissionsResponse> future = databaseAdminClient.testIamPermissionsCallable().futureCall(request);
     // Do something
     TestIamPermissionsResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DatabaseAdminClient this]
    (-> this (.testIamPermissionsCallable))))

(defn get-iam-policy
  "Gets the access control policy for a database resource. Returns an empty policy if a database
   exists but does not have a policy set.

   Authorization requires `spanner.databases.getIamPolicy` permission on
   [resource][google.iam.v1.GetIamPolicyRequest.resource].

   Sample code:



   try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
     String formattedResource = DatabaseName.format(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\");
     Policy response = databaseAdminClient.getIamPolicy(formattedResource);
   }

  resource - REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field. - `java.lang.String`

  returns: `com.google.iam.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.iam.v1.Policy [^DatabaseAdminClient this ^java.lang.String resource]
    (-> this (.getIamPolicy resource))))

(defn get-database-ddl-callable
  "Returns the schema of a Cloud Spanner database as a list of formatted DDL statements. This
   method does not show pending schema updates, those may be queried using the
   [Operations][google.longrunning.Operations] API.

   Sample code:



   try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
     DatabaseName database = DatabaseName.of(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\");
     GetDatabaseDdlRequest request = GetDatabaseDdlRequest.newBuilder()
       .setDatabase(database.toString())
       .build();
     ApiFuture<GetDatabaseDdlResponse> future = databaseAdminClient.getDatabaseDdlCallable().futureCall(request);
     // Do something
     GetDatabaseDdlResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.database.v1.GetDatabaseDdlRequest,com.google.spanner.admin.database.v1.GetDatabaseDdlResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DatabaseAdminClient this]
    (-> this (.getDatabaseDdlCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^DatabaseAdminClient this]
    (-> this (.isTerminated))))

(defn get-database-ddl
  "Returns the schema of a Cloud Spanner database as a list of formatted DDL statements. This
   method does not show pending schema updates, those may be queried using the
   [Operations][google.longrunning.Operations] API.

   Sample code:



   try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
     DatabaseName database = DatabaseName.of(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\");
     GetDatabaseDdlResponse response = databaseAdminClient.getDatabaseDdl(database);
   }

  database - Required. The database whose schema we wish to get. - `com.google.spanner.admin.database.v1.DatabaseName`

  returns: `com.google.spanner.admin.database.v1.GetDatabaseDdlResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.spanner.admin.database.v1.GetDatabaseDdlResponse [^DatabaseAdminClient this ^com.google.spanner.admin.database.v1.DatabaseName database]
    (-> this (.getDatabaseDdl database))))

(defn drop-database
  "Drops (aka deletes) a Cloud Spanner database.

   Sample code:



   try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
     DatabaseName database = DatabaseName.of(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\");
     databaseAdminClient.dropDatabase(database);
   }

  database - Required. The database to be dropped. - `com.google.spanner.admin.database.v1.DatabaseName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^DatabaseAdminClient this ^com.google.spanner.admin.database.v1.DatabaseName database]
    (-> this (.dropDatabase database))))

(defn create-database-callable
  "Creates a new Cloud Spanner database and starts to prepare it for serving. The returned
   [long-running operation][google.longrunning.Operation] will have a name of the format
   `<database_name>/operations/<operation_id>` and can be used to track preparation of
   the database. The [metadata][google.longrunning.Operation.metadata] field type is
   [CreateDatabaseMetadata][google.spanner.admin.database.v1.CreateDatabaseMetadata]. The
   [response][google.longrunning.Operation.response] field type is
   [Database][google.spanner.admin.database.v1.Database], if successful.

   Sample code:



   try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
     InstanceName parent = InstanceName.of(\"[PROJECT]\", \"[INSTANCE]\");
     String createStatement = \"\";
     CreateDatabaseRequest request = CreateDatabaseRequest.newBuilder()
       .setParent(parent.toString())
       .setCreateStatement(createStatement)
       .build();
     ApiFuture<Operation> future = databaseAdminClient.createDatabaseCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.database.v1.CreateDatabaseRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DatabaseAdminClient this]
    (-> this (.createDatabaseCallable))))

(defn shutdown-now
  ""
  ([^DatabaseAdminClient this]
    (-> this (.shutdownNow))))

(defn test-iam-permissions
  "Returns permissions that the caller has on the specified database resource.

   Attempting this RPC on a non-existent Cloud Spanner database will result in a NOT_FOUND
   error if the user has `spanner.databases.list` permission on the containing Cloud Spanner
   instance. Otherwise returns an empty set of permissions.

   Sample code:



   try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
     String formattedResource = DatabaseName.format(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\");
     List<String> permissions = new ArrayList<>();
     TestIamPermissionsResponse response = databaseAdminClient.testIamPermissions(formattedResource, permissions);
   }

  resource - REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field. - `java.lang.String`
  permissions - The set of permissions to check for the `resource`. Permissions with wildcards (such as '*' or 'storage.*') are not allowed. For more information see [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions). - `java.util.List`

  returns: `com.google.iam.v1.TestIamPermissionsResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.iam.v1.TestIamPermissionsResponse [^DatabaseAdminClient this ^java.lang.String resource ^java.util.List permissions]
    (-> this (.testIamPermissions resource permissions)))
  (^com.google.iam.v1.TestIamPermissionsResponse [^DatabaseAdminClient this ^com.google.iam.v1.TestIamPermissionsRequest request]
    (-> this (.testIamPermissions request))))

(defn update-database-ddl-callable
  "Updates the schema of a Cloud Spanner database by creating/altering/dropping tables, columns,
   indexes, etc. The returned [long-running operation][google.longrunning.Operation] will have a
   name of the format `<database_name>/operations/<operation_id>` and can be used to
   track execution of the schema change(s). The [metadata][google.longrunning.Operation.metadata]
   field type is
   [UpdateDatabaseDdlMetadata][google.spanner.admin.database.v1.UpdateDatabaseDdlMetadata]. The
   operation has no response.

   Sample code:



   try (DatabaseAdminClient databaseAdminClient = DatabaseAdminClient.create()) {
     DatabaseName database = DatabaseName.of(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\");
     List<String> statements = new ArrayList<>();
     UpdateDatabaseDdlRequest request = UpdateDatabaseDdlRequest.newBuilder()
       .setDatabase(database.toString())
       .addAllStatements(statements)
       .build();
     ApiFuture<Operation> future = databaseAdminClient.updateDatabaseDdlCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.admin.database.v1.UpdateDatabaseDdlRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DatabaseAdminClient this]
    (-> this (.updateDatabaseDdlCallable))))

