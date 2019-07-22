(ns com.google.cloud.spanner.v1.SpannerClient
  "Service Description: Cloud Spanner API

  The Cloud Spanner API can be used to manage sessions and execute transactions on data stored
  in Cloud Spanner databases.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (SpannerClient spannerClient = SpannerClient.create()) {
    DatabaseName database = DatabaseName.of(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\");
    Session response = spannerClient.createSession(database);
  }

  Note: close() needs to be called on the spannerClient object to clean up resources such as
  threads. In the example above, try-with-resources is used, which automatically calls close().

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

  This class can be customized by passing in a custom instance of SpannerSettings to create().
  For example:

  To customize credentials:



  SpannerSettings spannerSettings =
      SpannerSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  SpannerClient spannerClient =
      SpannerClient.create(spannerSettings);

  To customize the endpoint:



  SpannerSettings spannerSettings =
      SpannerSettings.newBuilder().setEndpoint(myEndpoint).build();
  SpannerClient spannerClient =
      SpannerClient.create(spannerSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner.v1 SpannerClient]))

(defn *create
  "Constructs an instance of SpannerClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.spanner.v1.SpannerSettings`

  returns: `com.google.cloud.spanner.v1.SpannerClient`

  throws: java.io.IOException"
  (^com.google.cloud.spanner.v1.SpannerClient [^com.google.cloud.spanner.v1.SpannerSettings settings]
    (SpannerClient/create settings))
  (^com.google.cloud.spanner.v1.SpannerClient []
    (SpannerClient/create )))

(defn delete-session
  "Ends a session, releasing server resources associated with it. This will asynchronously trigger
   cancellation of any operations that are running with this session.

   Sample code:



   try (SpannerClient spannerClient = SpannerClient.create()) {
     SessionName name = SessionName.of(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\", \"[SESSION]\");
     spannerClient.deleteSession(name);
   }

  name - Required. The name of the session to delete. - `com.google.spanner.v1.SessionName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^SpannerClient this ^com.google.spanner.v1.SessionName name]
    (-> this (.deleteSession name))))

(defn get-settings
  "returns: `com.google.cloud.spanner.v1.SpannerSettings`"
  (^com.google.cloud.spanner.v1.SpannerSettings [^SpannerClient this]
    (-> this (.getSettings))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.spanner.v1.stub.SpannerStub`"
  ([^SpannerClient this]
    (-> this (.getStub))))

(defn partition-query-callable
  "Creates a set of partition tokens that can be used to execute a query operation in parallel.
   Each of the returned partition tokens can be used by
   [ExecuteStreamingSql][google.spanner.v1.Spanner.ExecuteStreamingSql] to specify a subset of the
   query result to read. The same session and read-only transaction must be used by the
   PartitionQueryRequest used to create the partition tokens and the ExecuteSqlRequests that use
   the partition tokens.

   Partition tokens become invalid when the session used to create them is deleted, is idle for
   too long, begins a new transaction, or becomes too old. When any of these happen, it is not
   possible to resume the query, and the whole operation must be restarted from the beginning.

   Sample code:



   try (SpannerClient spannerClient = SpannerClient.create()) {
     SessionName session = SessionName.of(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\", \"[SESSION]\");
     String sql = \"\";
     PartitionQueryRequest request = PartitionQueryRequest.newBuilder()
       .setSession(session.toString())
       .setSql(sql)
       .build();
     ApiFuture<PartitionResponse> future = spannerClient.partitionQueryCallable().futureCall(request);
     // Do something
     PartitionResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.PartitionQueryRequest,com.google.spanner.v1.PartitionResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SpannerClient this]
    (-> this (.partitionQueryCallable))))

(defn read
  "Reads rows from the database using key lookups and scans, as a simple key/value style
   alternative to [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql]. This method cannot be used
   to return a result set larger than 10 MiB; if the read matches more data than that, the read
   fails with a `FAILED_PRECONDITION` error.

   Reads inside read-write transactions might return `ABORTED`. If this occurs, the application
   should restart the transaction from the beginning. See
   [Transaction][google.spanner.v1.Transaction] for more details.

   Larger result sets can be yielded in streaming fashion by calling
   [StreamingRead][google.spanner.v1.Spanner.StreamingRead] instead.

   Sample code:



   try (SpannerClient spannerClient = SpannerClient.create()) {
     SessionName session = SessionName.of(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\", \"[SESSION]\");
     String table = \"\";
     List<String> columns = new ArrayList<>();
     KeySet keySet = KeySet.newBuilder().build();
     ReadRequest request = ReadRequest.newBuilder()
       .setSession(session.toString())
       .setTable(table)
       .addAllColumns(columns)
       .setKeySet(keySet)
       .build();
     ResultSet response = spannerClient.read(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.spanner.v1.ReadRequest`

  returns: `com.google.spanner.v1.ResultSet`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.spanner.v1.ResultSet [^SpannerClient this ^com.google.spanner.v1.ReadRequest request]
    (-> this (.read request))))

(defn streaming-read-callable
  "Like [Read][google.spanner.v1.Spanner.Read], except returns the result set as a stream. Unlike
   [Read][google.spanner.v1.Spanner.Read], there is no limit on the size of the returned result
   set. However, no individual row in the result set can exceed 100 MiB, and no column value can
   exceed 10 MiB.

   Sample code:



   try (SpannerClient spannerClient = SpannerClient.create()) {
     SessionName session = SessionName.of(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\", \"[SESSION]\");
     String table = \"\";
     List<String> columns = new ArrayList<>();
     KeySet keySet = KeySet.newBuilder().build();
     ReadRequest request = ReadRequest.newBuilder()
       .setSession(session.toString())
       .setTable(table)
       .addAllColumns(columns)
       .setKeySet(keySet)
       .build();

     ServerStream<PartialResultSet> stream = spannerClient.streamingReadCallable().call(request);
     for (PartialResultSet response : stream) {
       // Do something when receive a response
     }
   }

  returns: `com.google.api.gax.rpc.ServerStreamingCallable<com.google.spanner.v1.ReadRequest,com.google.spanner.v1.PartialResultSet>`"
  (^com.google.api.gax.rpc.ServerStreamingCallable [^SpannerClient this]
    (-> this (.streamingReadCallable))))

(defn get-session
  "Gets a session. Returns `NOT_FOUND` if the session does not exist. This is mainly useful for
   determining whether a session is still alive.

   Sample code:



   try (SpannerClient spannerClient = SpannerClient.create()) {
     SessionName name = SessionName.of(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\", \"[SESSION]\");
     Session response = spannerClient.getSession(name);
   }

  name - Required. The name of the session to retrieve. - `com.google.spanner.v1.SessionName`

  returns: `com.google.spanner.v1.Session`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.spanner.v1.Session [^SpannerClient this ^com.google.spanner.v1.SessionName name]
    (-> this (.getSession name))))

(defn partition-read-callable
  "Creates a set of partition tokens that can be used to execute a read operation in parallel.
   Each of the returned partition tokens can be used by
   [StreamingRead][google.spanner.v1.Spanner.StreamingRead] to specify a subset of the read result
   to read. The same session and read-only transaction must be used by the PartitionReadRequest
   used to create the partition tokens and the ReadRequests that use the partition tokens. There
   are no ordering guarantees on rows returned among the returned partition tokens, or even within
   each individual StreamingRead call issued with a partition_token.

   Partition tokens become invalid when the session used to create them is deleted, is idle for
   too long, begins a new transaction, or becomes too old. When any of these happen, it is not
   possible to resume the read, and the whole operation must be restarted from the beginning.

   Sample code:



   try (SpannerClient spannerClient = SpannerClient.create()) {
     SessionName session = SessionName.of(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\", \"[SESSION]\");
     String table = \"\";
     KeySet keySet = KeySet.newBuilder().build();
     PartitionReadRequest request = PartitionReadRequest.newBuilder()
       .setSession(session.toString())
       .setTable(table)
       .setKeySet(keySet)
       .build();
     ApiFuture<PartitionResponse> future = spannerClient.partitionReadCallable().futureCall(request);
     // Do something
     PartitionResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.PartitionReadRequest,com.google.spanner.v1.PartitionResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SpannerClient this]
    (-> this (.partitionReadCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^SpannerClient this]
    (-> this (.isShutdown))))

(defn list-sessions-callable
  "Lists all sessions in a given database.

   Sample code:



   try (SpannerClient spannerClient = SpannerClient.create()) {
     String formattedDatabase = DatabaseName.format(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\");
     ListSessionsRequest request = ListSessionsRequest.newBuilder()
       .setDatabase(formattedDatabase)
       .build();
     while (true) {
       ListSessionsResponse response = spannerClient.listSessionsCallable().call(request);
       for (Session element : response.getSessionsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.ListSessionsRequest,com.google.spanner.v1.ListSessionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SpannerClient this]
    (-> this (.listSessionsCallable))))

(defn create-session
  "Creates a new session. A session can be used to perform transactions that read and/or modify
   data in a Cloud Spanner database. Sessions are meant to be reused for many consecutive
   transactions.

   Sessions can only execute one transaction at a time. To execute multiple concurrent
   read-write/write-only transactions, create multiple sessions. Note that standalone reads and
   queries use a transaction internally, and count toward the one transaction limit.

   Cloud Spanner limits the number of sessions that can exist at any given time; thus, it is a
   good idea to delete idle and/or unneeded sessions. Aside from explicit deletes, Cloud Spanner
   can delete sessions for which no operations are sent for more than an hour. If a session is
   deleted, requests to it return `NOT_FOUND`.

   Idle sessions can be kept alive by sending a trivial SQL query periodically, e.g., `\"SELECT
   1\"`.

   Sample code:



   try (SpannerClient spannerClient = SpannerClient.create()) {
     DatabaseName database = DatabaseName.of(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\");
     Session response = spannerClient.createSession(database);
   }

  database - Required. The database in which the new session is created. - `com.google.spanner.v1.DatabaseName`

  returns: `com.google.spanner.v1.Session`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.spanner.v1.Session [^SpannerClient this ^com.google.spanner.v1.DatabaseName database]
    (-> this (.createSession database))))

(defn get-session-callable
  "Gets a session. Returns `NOT_FOUND` if the session does not exist. This is mainly useful for
   determining whether a session is still alive.

   Sample code:



   try (SpannerClient spannerClient = SpannerClient.create()) {
     SessionName name = SessionName.of(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\", \"[SESSION]\");
     GetSessionRequest request = GetSessionRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Session> future = spannerClient.getSessionCallable().futureCall(request);
     // Do something
     Session response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.GetSessionRequest,com.google.spanner.v1.Session>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SpannerClient this]
    (-> this (.getSessionCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^SpannerClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn read-callable
  "Reads rows from the database using key lookups and scans, as a simple key/value style
   alternative to [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql]. This method cannot be used
   to return a result set larger than 10 MiB; if the read matches more data than that, the read
   fails with a `FAILED_PRECONDITION` error.

   Reads inside read-write transactions might return `ABORTED`. If this occurs, the application
   should restart the transaction from the beginning. See
   [Transaction][google.spanner.v1.Transaction] for more details.

   Larger result sets can be yielded in streaming fashion by calling
   [StreamingRead][google.spanner.v1.Spanner.StreamingRead] instead.

   Sample code:



   try (SpannerClient spannerClient = SpannerClient.create()) {
     SessionName session = SessionName.of(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\", \"[SESSION]\");
     String table = \"\";
     List<String> columns = new ArrayList<>();
     KeySet keySet = KeySet.newBuilder().build();
     ReadRequest request = ReadRequest.newBuilder()
       .setSession(session.toString())
       .setTable(table)
       .addAllColumns(columns)
       .setKeySet(keySet)
       .build();
     ApiFuture<ResultSet> future = spannerClient.readCallable().futureCall(request);
     // Do something
     ResultSet response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.ReadRequest,com.google.spanner.v1.ResultSet>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SpannerClient this]
    (-> this (.readCallable))))

(defn execute-batch-dml
  "Executes a batch of SQL DML statements. This method allows many statements to be run with lower
   latency than submitting them sequentially with
   [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql].

   Statements are executed in order, sequentially.
   [ExecuteBatchDmlResponse][Spanner.ExecuteBatchDmlResponse] will contain a
   [ResultSet][google.spanner.v1.ResultSet] for each DML statement that has successfully executed.
   If a statement fails, its error status will be returned as part of the
   [ExecuteBatchDmlResponse][Spanner.ExecuteBatchDmlResponse]. Execution will stop at the first
   failed statement; the remaining statements will not run.

   ExecuteBatchDml is expected to return an OK status with a response even if there was an
   error while processing one of the DML statements. Clients must inspect response.status to
   determine if there were any errors while processing the request.

   See more details in [ExecuteBatchDmlRequest][Spanner.ExecuteBatchDmlRequest] and
   [ExecuteBatchDmlResponse][Spanner.ExecuteBatchDmlResponse].

   Sample code:



   try (SpannerClient spannerClient = SpannerClient.create()) {
     SessionName session = SessionName.of(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\", \"[SESSION]\");
     TransactionSelector transaction = TransactionSelector.newBuilder().build();
     List<ExecuteBatchDmlRequest.Statement> statements = new ArrayList<>();
     long seqno = 0L;
     ExecuteBatchDmlRequest request = ExecuteBatchDmlRequest.newBuilder()
       .setSession(session.toString())
       .setTransaction(transaction)
       .addAllStatements(statements)
       .setSeqno(seqno)
       .build();
     ExecuteBatchDmlResponse response = spannerClient.executeBatchDml(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.spanner.v1.ExecuteBatchDmlRequest`

  returns: `com.google.spanner.v1.ExecuteBatchDmlResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.spanner.v1.ExecuteBatchDmlResponse [^SpannerClient this ^com.google.spanner.v1.ExecuteBatchDmlRequest request]
    (-> this (.executeBatchDml request))))

(defn commit
  "Commits a transaction. The request includes the mutations to be applied to rows in the
   database.

   `Commit` might return an `ABORTED` error. This can occur at any time; commonly, the cause is
   conflicts with concurrent transactions. However, it can also happen for a variety of other
   reasons. If `Commit` returns `ABORTED`, the caller should re-attempt the transaction from the
   beginning, re-using the same session.

   Sample code:



   try (SpannerClient spannerClient = SpannerClient.create()) {
     SessionName session = SessionName.of(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\", \"[SESSION]\");
     ByteString transactionId = ByteString.copyFromUtf8(\"\");
     List<Mutation> mutations = new ArrayList<>();
     CommitResponse response = spannerClient.commit(session, transactionId, mutations);
   }

  session - Required. The session in which the transaction to be committed is running. - `com.google.spanner.v1.SessionName`
  transaction-id - Commit a previously-started transaction. - `com.google.protobuf.ByteString`
  mutations - The mutations to be executed when this transaction commits. All mutations are applied atomically, in the order they appear in this list. - `java.util.List`

  returns: `com.google.spanner.v1.CommitResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.spanner.v1.CommitResponse [^SpannerClient this ^com.google.spanner.v1.SessionName session ^com.google.protobuf.ByteString transaction-id ^java.util.List mutations]
    (-> this (.commit session transaction-id mutations)))
  (^com.google.spanner.v1.CommitResponse [^SpannerClient this ^com.google.spanner.v1.CommitRequest request]
    (-> this (.commit request))))

(defn shutdown
  ""
  ([^SpannerClient this]
    (-> this (.shutdown))))

(defn list-sessions
  "Lists all sessions in a given database.

   Sample code:



   try (SpannerClient spannerClient = SpannerClient.create()) {
     String formattedDatabase = DatabaseName.format(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\");
     for (Session element : spannerClient.listSessions(formattedDatabase).iterateAll()) {
       // doThingsWith(element);
     }
   }

  database - Required. The database in which to list sessions. - `java.lang.String`

  returns: `com.google.cloud.spanner.v1.SpannerClient$ListSessionsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.spanner.v1.SpannerClient$ListSessionsPagedResponse [^SpannerClient this ^java.lang.String database]
    (-> this (.listSessions database))))

(defn execute-streaming-sql-callable
  "Like [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql], except returns the result set as a
   stream. Unlike [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql], there is no limit on the
   size of the returned result set. However, no individual row in the result set can exceed 100
   MiB, and no column value can exceed 10 MiB.

   Sample code:



   try (SpannerClient spannerClient = SpannerClient.create()) {
     SessionName session = SessionName.of(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\", \"[SESSION]\");
     String sql = \"\";
     ExecuteSqlRequest request = ExecuteSqlRequest.newBuilder()
       .setSession(session.toString())
       .setSql(sql)
       .build();

     ServerStream<PartialResultSet> stream = spannerClient.executeStreamingSqlCallable().call(request);
     for (PartialResultSet response : stream) {
       // Do something when receive a response
     }
   }

  returns: `com.google.api.gax.rpc.ServerStreamingCallable<com.google.spanner.v1.ExecuteSqlRequest,com.google.spanner.v1.PartialResultSet>`"
  (^com.google.api.gax.rpc.ServerStreamingCallable [^SpannerClient this]
    (-> this (.executeStreamingSqlCallable))))

(defn partition-query
  "Creates a set of partition tokens that can be used to execute a query operation in parallel.
   Each of the returned partition tokens can be used by
   [ExecuteStreamingSql][google.spanner.v1.Spanner.ExecuteStreamingSql] to specify a subset of the
   query result to read. The same session and read-only transaction must be used by the
   PartitionQueryRequest used to create the partition tokens and the ExecuteSqlRequests that use
   the partition tokens.

   Partition tokens become invalid when the session used to create them is deleted, is idle for
   too long, begins a new transaction, or becomes too old. When any of these happen, it is not
   possible to resume the query, and the whole operation must be restarted from the beginning.

   Sample code:



   try (SpannerClient spannerClient = SpannerClient.create()) {
     SessionName session = SessionName.of(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\", \"[SESSION]\");
     String sql = \"\";
     PartitionQueryRequest request = PartitionQueryRequest.newBuilder()
       .setSession(session.toString())
       .setSql(sql)
       .build();
     PartitionResponse response = spannerClient.partitionQuery(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.spanner.v1.PartitionQueryRequest`

  returns: `com.google.spanner.v1.PartitionResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.spanner.v1.PartitionResponse [^SpannerClient this ^com.google.spanner.v1.PartitionQueryRequest request]
    (-> this (.partitionQuery request))))

(defn execute-sql
  "Executes an SQL statement, returning all results in a single reply. This method cannot be used
   to return a result set larger than 10 MiB; if the query yields more data than that, the query
   fails with a `FAILED_PRECONDITION` error.

   Operations inside read-write transactions might return `ABORTED`. If this occurs, the
   application should restart the transaction from the beginning. See
   [Transaction][google.spanner.v1.Transaction] for more details.

   Larger result sets can be fetched in streaming fashion by calling
   [ExecuteStreamingSql][google.spanner.v1.Spanner.ExecuteStreamingSql] instead.

   Sample code:



   try (SpannerClient spannerClient = SpannerClient.create()) {
     SessionName session = SessionName.of(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\", \"[SESSION]\");
     String sql = \"\";
     ExecuteSqlRequest request = ExecuteSqlRequest.newBuilder()
       .setSession(session.toString())
       .setSql(sql)
       .build();
     ResultSet response = spannerClient.executeSql(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.spanner.v1.ExecuteSqlRequest`

  returns: `com.google.spanner.v1.ResultSet`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.spanner.v1.ResultSet [^SpannerClient this ^com.google.spanner.v1.ExecuteSqlRequest request]
    (-> this (.executeSql request))))

(defn close
  ""
  ([^SpannerClient this]
    (-> this (.close))))

(defn commit-callable
  "Commits a transaction. The request includes the mutations to be applied to rows in the
   database.

   `Commit` might return an `ABORTED` error. This can occur at any time; commonly, the cause is
   conflicts with concurrent transactions. However, it can also happen for a variety of other
   reasons. If `Commit` returns `ABORTED`, the caller should re-attempt the transaction from the
   beginning, re-using the same session.

   Sample code:



   try (SpannerClient spannerClient = SpannerClient.create()) {
     SessionName session = SessionName.of(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\", \"[SESSION]\");
     List<Mutation> mutations = new ArrayList<>();
     CommitRequest request = CommitRequest.newBuilder()
       .setSession(session.toString())
       .addAllMutations(mutations)
       .build();
     ApiFuture<CommitResponse> future = spannerClient.commitCallable().futureCall(request);
     // Do something
     CommitResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.CommitRequest,com.google.spanner.v1.CommitResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SpannerClient this]
    (-> this (.commitCallable))))

(defn partition-read
  "Creates a set of partition tokens that can be used to execute a read operation in parallel.
   Each of the returned partition tokens can be used by
   [StreamingRead][google.spanner.v1.Spanner.StreamingRead] to specify a subset of the read result
   to read. The same session and read-only transaction must be used by the PartitionReadRequest
   used to create the partition tokens and the ReadRequests that use the partition tokens. There
   are no ordering guarantees on rows returned among the returned partition tokens, or even within
   each individual StreamingRead call issued with a partition_token.

   Partition tokens become invalid when the session used to create them is deleted, is idle for
   too long, begins a new transaction, or becomes too old. When any of these happen, it is not
   possible to resume the read, and the whole operation must be restarted from the beginning.

   Sample code:



   try (SpannerClient spannerClient = SpannerClient.create()) {
     SessionName session = SessionName.of(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\", \"[SESSION]\");
     String table = \"\";
     KeySet keySet = KeySet.newBuilder().build();
     PartitionReadRequest request = PartitionReadRequest.newBuilder()
       .setSession(session.toString())
       .setTable(table)
       .setKeySet(keySet)
       .build();
     PartitionResponse response = spannerClient.partitionRead(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.spanner.v1.PartitionReadRequest`

  returns: `com.google.spanner.v1.PartitionResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.spanner.v1.PartitionResponse [^SpannerClient this ^com.google.spanner.v1.PartitionReadRequest request]
    (-> this (.partitionRead request))))

(defn rollback
  "Rolls back a transaction, releasing any locks it holds. It is a good idea to call this for any
   transaction that includes one or more [Read][google.spanner.v1.Spanner.Read] or
   [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql] requests and ultimately decides not to
   commit.

   `Rollback` returns `OK` if it successfully aborts the transaction, the transaction was
   already aborted, or the transaction is not found. `Rollback` never returns `ABORTED`.

   Sample code:



   try (SpannerClient spannerClient = SpannerClient.create()) {
     SessionName session = SessionName.of(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\", \"[SESSION]\");
     ByteString transactionId = ByteString.copyFromUtf8(\"\");
     spannerClient.rollback(session, transactionId);
   }

  session - Required. The session in which the transaction to roll back is running. - `com.google.spanner.v1.SessionName`
  transaction-id - Required. The transaction to roll back. - `com.google.protobuf.ByteString`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^SpannerClient this ^com.google.spanner.v1.SessionName session ^com.google.protobuf.ByteString transaction-id]
    (-> this (.rollback session transaction-id)))
  ([^SpannerClient this ^com.google.spanner.v1.RollbackRequest request]
    (-> this (.rollback request))))

(defn rollback-callable
  "Rolls back a transaction, releasing any locks it holds. It is a good idea to call this for any
   transaction that includes one or more [Read][google.spanner.v1.Spanner.Read] or
   [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql] requests and ultimately decides not to
   commit.

   `Rollback` returns `OK` if it successfully aborts the transaction, the transaction was
   already aborted, or the transaction is not found. `Rollback` never returns `ABORTED`.

   Sample code:



   try (SpannerClient spannerClient = SpannerClient.create()) {
     SessionName session = SessionName.of(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\", \"[SESSION]\");
     ByteString transactionId = ByteString.copyFromUtf8(\"\");
     RollbackRequest request = RollbackRequest.newBuilder()
       .setSession(session.toString())
       .setTransactionId(transactionId)
       .build();
     ApiFuture<Void> future = spannerClient.rollbackCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.RollbackRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SpannerClient this]
    (-> this (.rollbackCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^SpannerClient this]
    (-> this (.isTerminated))))

(defn delete-session-callable
  "Ends a session, releasing server resources associated with it. This will asynchronously trigger
   cancellation of any operations that are running with this session.

   Sample code:



   try (SpannerClient spannerClient = SpannerClient.create()) {
     SessionName name = SessionName.of(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\", \"[SESSION]\");
     DeleteSessionRequest request = DeleteSessionRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = spannerClient.deleteSessionCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.DeleteSessionRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SpannerClient this]
    (-> this (.deleteSessionCallable))))

(defn begin-transaction
  "Begins a new transaction. This step can often be skipped:
   [Read][google.spanner.v1.Spanner.Read], [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql] and
   [Commit][google.spanner.v1.Spanner.Commit] can begin a new transaction as a side-effect.

   Sample code:



   try (SpannerClient spannerClient = SpannerClient.create()) {
     SessionName session = SessionName.of(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\", \"[SESSION]\");
     TransactionOptions options = TransactionOptions.newBuilder().build();
     Transaction response = spannerClient.beginTransaction(session, options);
   }

  session - Required. The session in which the transaction runs. - `com.google.spanner.v1.SessionName`
  options - Required. Options for the new transaction. - `com.google.spanner.v1.TransactionOptions`

  returns: `com.google.spanner.v1.Transaction`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.spanner.v1.Transaction [^SpannerClient this ^com.google.spanner.v1.SessionName session ^com.google.spanner.v1.TransactionOptions options]
    (-> this (.beginTransaction session options)))
  (^com.google.spanner.v1.Transaction [^SpannerClient this ^com.google.spanner.v1.BeginTransactionRequest request]
    (-> this (.beginTransaction request))))

(defn create-session-callable
  "Creates a new session. A session can be used to perform transactions that read and/or modify
   data in a Cloud Spanner database. Sessions are meant to be reused for many consecutive
   transactions.

   Sessions can only execute one transaction at a time. To execute multiple concurrent
   read-write/write-only transactions, create multiple sessions. Note that standalone reads and
   queries use a transaction internally, and count toward the one transaction limit.

   Cloud Spanner limits the number of sessions that can exist at any given time; thus, it is a
   good idea to delete idle and/or unneeded sessions. Aside from explicit deletes, Cloud Spanner
   can delete sessions for which no operations are sent for more than an hour. If a session is
   deleted, requests to it return `NOT_FOUND`.

   Idle sessions can be kept alive by sending a trivial SQL query periodically, e.g., `\"SELECT
   1\"`.

   Sample code:



   try (SpannerClient spannerClient = SpannerClient.create()) {
     DatabaseName database = DatabaseName.of(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\");
     CreateSessionRequest request = CreateSessionRequest.newBuilder()
       .setDatabase(database.toString())
       .build();
     ApiFuture<Session> future = spannerClient.createSessionCallable().futureCall(request);
     // Do something
     Session response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.CreateSessionRequest,com.google.spanner.v1.Session>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SpannerClient this]
    (-> this (.createSessionCallable))))

(defn execute-batch-dml-callable
  "Executes a batch of SQL DML statements. This method allows many statements to be run with lower
   latency than submitting them sequentially with
   [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql].

   Statements are executed in order, sequentially.
   [ExecuteBatchDmlResponse][Spanner.ExecuteBatchDmlResponse] will contain a
   [ResultSet][google.spanner.v1.ResultSet] for each DML statement that has successfully executed.
   If a statement fails, its error status will be returned as part of the
   [ExecuteBatchDmlResponse][Spanner.ExecuteBatchDmlResponse]. Execution will stop at the first
   failed statement; the remaining statements will not run.

   ExecuteBatchDml is expected to return an OK status with a response even if there was an
   error while processing one of the DML statements. Clients must inspect response.status to
   determine if there were any errors while processing the request.

   See more details in [ExecuteBatchDmlRequest][Spanner.ExecuteBatchDmlRequest] and
   [ExecuteBatchDmlResponse][Spanner.ExecuteBatchDmlResponse].

   Sample code:



   try (SpannerClient spannerClient = SpannerClient.create()) {
     SessionName session = SessionName.of(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\", \"[SESSION]\");
     TransactionSelector transaction = TransactionSelector.newBuilder().build();
     List<ExecuteBatchDmlRequest.Statement> statements = new ArrayList<>();
     long seqno = 0L;
     ExecuteBatchDmlRequest request = ExecuteBatchDmlRequest.newBuilder()
       .setSession(session.toString())
       .setTransaction(transaction)
       .addAllStatements(statements)
       .setSeqno(seqno)
       .build();
     ApiFuture<ExecuteBatchDmlResponse> future = spannerClient.executeBatchDmlCallable().futureCall(request);
     // Do something
     ExecuteBatchDmlResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.ExecuteBatchDmlRequest,com.google.spanner.v1.ExecuteBatchDmlResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SpannerClient this]
    (-> this (.executeBatchDmlCallable))))

(defn list-sessions-paged-callable
  "Lists all sessions in a given database.

   Sample code:



   try (SpannerClient spannerClient = SpannerClient.create()) {
     String formattedDatabase = DatabaseName.format(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\");
     ListSessionsRequest request = ListSessionsRequest.newBuilder()
       .setDatabase(formattedDatabase)
       .build();
     ApiFuture<ListSessionsPagedResponse> future = spannerClient.listSessionsPagedCallable().futureCall(request);
     // Do something
     for (Session element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.ListSessionsRequest,com.google.cloud.spanner.v1.SpannerClient$ListSessionsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SpannerClient this]
    (-> this (.listSessionsPagedCallable))))

(defn shutdown-now
  ""
  ([^SpannerClient this]
    (-> this (.shutdownNow))))

(defn begin-transaction-callable
  "Begins a new transaction. This step can often be skipped:
   [Read][google.spanner.v1.Spanner.Read], [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql] and
   [Commit][google.spanner.v1.Spanner.Commit] can begin a new transaction as a side-effect.

   Sample code:



   try (SpannerClient spannerClient = SpannerClient.create()) {
     SessionName session = SessionName.of(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\", \"[SESSION]\");
     TransactionOptions options = TransactionOptions.newBuilder().build();
     BeginTransactionRequest request = BeginTransactionRequest.newBuilder()
       .setSession(session.toString())
       .setOptions(options)
       .build();
     ApiFuture<Transaction> future = spannerClient.beginTransactionCallable().futureCall(request);
     // Do something
     Transaction response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.BeginTransactionRequest,com.google.spanner.v1.Transaction>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SpannerClient this]
    (-> this (.beginTransactionCallable))))

(defn execute-sql-callable
  "Executes an SQL statement, returning all results in a single reply. This method cannot be used
   to return a result set larger than 10 MiB; if the query yields more data than that, the query
   fails with a `FAILED_PRECONDITION` error.

   Operations inside read-write transactions might return `ABORTED`. If this occurs, the
   application should restart the transaction from the beginning. See
   [Transaction][google.spanner.v1.Transaction] for more details.

   Larger result sets can be fetched in streaming fashion by calling
   [ExecuteStreamingSql][google.spanner.v1.Spanner.ExecuteStreamingSql] instead.

   Sample code:



   try (SpannerClient spannerClient = SpannerClient.create()) {
     SessionName session = SessionName.of(\"[PROJECT]\", \"[INSTANCE]\", \"[DATABASE]\", \"[SESSION]\");
     String sql = \"\";
     ExecuteSqlRequest request = ExecuteSqlRequest.newBuilder()
       .setSession(session.toString())
       .setSql(sql)
       .build();
     ApiFuture<ResultSet> future = spannerClient.executeSqlCallable().futureCall(request);
     // Do something
     ResultSet response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.spanner.v1.ExecuteSqlRequest,com.google.spanner.v1.ResultSet>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SpannerClient this]
    (-> this (.executeSqlCallable))))

