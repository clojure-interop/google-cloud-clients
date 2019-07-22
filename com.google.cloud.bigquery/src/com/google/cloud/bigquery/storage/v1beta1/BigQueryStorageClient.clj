(ns com.google.cloud.bigquery.storage.v1beta1.BigQueryStorageClient
  "Service Description: BigQuery storage API.

  The BigQuery storage API can be used to read data stored in BigQuery.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (BigQueryStorageClient bigQueryStorageClient = BigQueryStorageClient.create()) {
    TableReference tableReference = TableReference.newBuilder().build();
    String parent = \"\";
    int requestedStreams = 0;
    ReadSession response = bigQueryStorageClient.createReadSession(tableReference, parent, requestedStreams);
  }

  Note: close() needs to be called on the bigQueryStorageClient object to clean up resources
  such as threads. In the example above, try-with-resources is used, which automatically calls
  close().

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

  This class can be customized by passing in a custom instance of BigQueryStorageSettings to
  create(). For example:

  To customize credentials:



  BigQueryStorageSettings bigQueryStorageSettings =
      BigQueryStorageSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  BigQueryStorageClient bigQueryStorageClient =
      BigQueryStorageClient.create(bigQueryStorageSettings);

  To customize the endpoint:



  BigQueryStorageSettings bigQueryStorageSettings =
      BigQueryStorageSettings.newBuilder().setEndpoint(myEndpoint).build();
  BigQueryStorageClient bigQueryStorageClient =
      BigQueryStorageClient.create(bigQueryStorageSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery.storage.v1beta1 BigQueryStorageClient]))

(defn *create
  "Constructs an instance of BigQueryStorageClient, using the given settings. The channels
   are created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.bigquery.storage.v1beta1.BigQueryStorageSettings`

  returns: `com.google.cloud.bigquery.storage.v1beta1.BigQueryStorageClient`

  throws: java.io.IOException"
  (^com.google.cloud.bigquery.storage.v1beta1.BigQueryStorageClient [^com.google.cloud.bigquery.storage.v1beta1.BigQueryStorageSettings settings]
    (BigQueryStorageClient/create settings))
  (^com.google.cloud.bigquery.storage.v1beta1.BigQueryStorageClient []
    (BigQueryStorageClient/create )))

(defn create-read-session
  "Creates a new read session. A read session divides the contents of a BigQuery table into one or
   more streams, which can then be used to read data from the table. The read session also
   specifies properties of the data to be read, such as a list of columns or a push-down filter
   describing the rows to be returned.

   A particular row can be read by at most one stream. When the caller has reached the end of
   each stream in the session, then all the data in the table has been read.

   Read sessions automatically expire 24 hours after they are created and do not require manual
   clean-up by the caller.

   Sample code:



   try (BigQueryStorageClient bigQueryStorageClient = BigQueryStorageClient.create()) {
     TableReference tableReference = TableReference.newBuilder().build();
     String parent = \"\";
     int requestedStreams = 0;
     ReadSession response = bigQueryStorageClient.createReadSession(tableReference, parent, requestedStreams);
   }

  table-reference - Required. Reference to the table to read. - `com.google.cloud.bigquery.storage.v1beta1.TableReferenceProto$TableReference`
  parent - Required. String of the form \"projects/your-project-id\" indicating the project this ReadSession is associated with. This is the project that will be billed for usage. - `java.lang.String`
  requested-streams - Optional. Initial number of streams. If unset or 0, we will provide a value of streams so as to produce reasonable throughput. Must be non-negative. The number of streams may be lower than the requested number, depending on the amount parallelism that is reasonable for the table and the maximum amount of parallelism allowed by the system. Streams must be read starting from offset 0. - `int`

  returns: `com.google.cloud.bigquery.storage.v1beta1.Storage$ReadSession`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.bigquery.storage.v1beta1.Storage$ReadSession [^BigQueryStorageClient this ^com.google.cloud.bigquery.storage.v1beta1.TableReferenceProto$TableReference table-reference ^java.lang.String parent ^Integer requested-streams]
    (-> this (.createReadSession table-reference parent requested-streams)))
  (^com.google.cloud.bigquery.storage.v1beta1.Storage$ReadSession [^BigQueryStorageClient this ^com.google.cloud.bigquery.storage.v1beta1.Storage$CreateReadSessionRequest request]
    (-> this (.createReadSession request))))

(defn split-read-stream
  "Splits a given read stream into two Streams. These streams are referred to as the primary and
   the residual of the split. The original stream can still be read from in the same manner as
   before. Both of the returned streams can also be read from, and the total rows return by both
   child streams will be the same as the rows read from the original stream.

   Moreover, the two child streams will be allocated back to back in the original Stream.
   Concretely, it is guaranteed that for streams Original, Primary, and Residual, that
   Original[0-j] = Primary[0-j] and Original[j-n] = Residual[0-m] once the streams have been read
   to completion.

   This method is guaranteed to be idempotent.

   Sample code:



   try (BigQueryStorageClient bigQueryStorageClient = BigQueryStorageClient.create()) {
     Stream originalStream = Stream.newBuilder().build();
     SplitReadStreamResponse response = bigQueryStorageClient.splitReadStream(originalStream);
   }

  original-stream - Stream to split. - `com.google.cloud.bigquery.storage.v1beta1.Storage$Stream`

  returns: `com.google.cloud.bigquery.storage.v1beta1.Storage$SplitReadStreamResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.bigquery.storage.v1beta1.Storage$SplitReadStreamResponse [^BigQueryStorageClient this ^com.google.cloud.bigquery.storage.v1beta1.Storage$Stream original-stream]
    (-> this (.splitReadStream original-stream))))

(defn batch-create-read-session-streams-callable
  "Creates additional streams for a ReadSession. This API can be used to dynamically adjust the
   parallelism of a batch processing task upwards by adding additional workers.

   Sample code:



   try (BigQueryStorageClient bigQueryStorageClient = BigQueryStorageClient.create()) {
     ReadSession session = ReadSession.newBuilder().build();
     int requestedStreams = 0;
     BatchCreateReadSessionStreamsRequest request = BatchCreateReadSessionStreamsRequest.newBuilder()
       .setSession(session)
       .setRequestedStreams(requestedStreams)
       .build();
     ApiFuture<BatchCreateReadSessionStreamsResponse> future = bigQueryStorageClient.batchCreateReadSessionStreamsCallable().futureCall(request);
     // Do something
     BatchCreateReadSessionStreamsResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.storage.v1beta1.Storage$BatchCreateReadSessionStreamsRequest,com.google.cloud.bigquery.storage.v1beta1.Storage$BatchCreateReadSessionStreamsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BigQueryStorageClient this]
    (-> this (.batchCreateReadSessionStreamsCallable))))

(defn get-settings
  "returns: `com.google.cloud.bigquery.storage.v1beta1.BigQueryStorageSettings`"
  (^com.google.cloud.bigquery.storage.v1beta1.BigQueryStorageSettings [^BigQueryStorageClient this]
    (-> this (.getSettings))))

(defn create-read-session-callable
  "Creates a new read session. A read session divides the contents of a BigQuery table into one or
   more streams, which can then be used to read data from the table. The read session also
   specifies properties of the data to be read, such as a list of columns or a push-down filter
   describing the rows to be returned.

   A particular row can be read by at most one stream. When the caller has reached the end of
   each stream in the session, then all the data in the table has been read.

   Read sessions automatically expire 24 hours after they are created and do not require manual
   clean-up by the caller.

   Sample code:



   try (BigQueryStorageClient bigQueryStorageClient = BigQueryStorageClient.create()) {
     TableReference tableReference = TableReference.newBuilder().build();
     String parent = \"\";
     CreateReadSessionRequest request = CreateReadSessionRequest.newBuilder()
       .setTableReference(tableReference)
       .setParent(parent)
       .build();
     ApiFuture<ReadSession> future = bigQueryStorageClient.createReadSessionCallable().futureCall(request);
     // Do something
     ReadSession response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.storage.v1beta1.Storage$CreateReadSessionRequest,com.google.cloud.bigquery.storage.v1beta1.Storage$ReadSession>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BigQueryStorageClient this]
    (-> this (.createReadSessionCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.bigquery.storage.v1beta1.stub.EnhancedBigQueryStorageStub`"
  ([^BigQueryStorageClient this]
    (-> this (.getStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^BigQueryStorageClient this]
    (-> this (.isShutdown))))

(defn batch-create-read-session-streams
  "Creates additional streams for a ReadSession. This API can be used to dynamically adjust the
   parallelism of a batch processing task upwards by adding additional workers.

   Sample code:



   try (BigQueryStorageClient bigQueryStorageClient = BigQueryStorageClient.create()) {
     ReadSession session = ReadSession.newBuilder().build();
     int requestedStreams = 0;
     BatchCreateReadSessionStreamsResponse response = bigQueryStorageClient.batchCreateReadSessionStreams(session, requestedStreams);
   }

  session - Required. Must be a non-expired session obtained from a call to CreateReadSession. Only the name field needs to be set. - `com.google.cloud.bigquery.storage.v1beta1.Storage$ReadSession`
  requested-streams - Required. Number of new streams requested. Must be positive. Number of added streams may be less than this, see CreateReadSessionRequest for more information. - `int`

  returns: `com.google.cloud.bigquery.storage.v1beta1.Storage$BatchCreateReadSessionStreamsResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.bigquery.storage.v1beta1.Storage$BatchCreateReadSessionStreamsResponse [^BigQueryStorageClient this ^com.google.cloud.bigquery.storage.v1beta1.Storage$ReadSession session ^Integer requested-streams]
    (-> this (.batchCreateReadSessionStreams session requested-streams)))
  (^com.google.cloud.bigquery.storage.v1beta1.Storage$BatchCreateReadSessionStreamsResponse [^BigQueryStorageClient this ^com.google.cloud.bigquery.storage.v1beta1.Storage$BatchCreateReadSessionStreamsRequest request]
    (-> this (.batchCreateReadSessionStreams request))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^BigQueryStorageClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^BigQueryStorageClient this]
    (-> this (.shutdown))))

(defn finalize-stream
  "Triggers the graceful termination of a single stream in a ReadSession. This API can be used to
   dynamically adjust the parallelism of a batch processing task downwards without losing data.

   This API does not delete the stream -- it remains visible in the ReadSession, and any data
   processed by the stream is not released to other streams. However, no additional data will be
   assigned to the stream once this call completes. Callers must continue reading data on the
   stream until the end of the stream is reached so that data which has already been assigned to
   the stream will be processed.

   This method will return an error if there are no other live streams in the Session, or if
   SplitReadStream() has been called on the given Stream.

   Sample code:



   try (BigQueryStorageClient bigQueryStorageClient = BigQueryStorageClient.create()) {
     Stream stream = Stream.newBuilder().build();
     bigQueryStorageClient.finalizeStream(stream);
   }

  stream - Stream to finalize. - `com.google.cloud.bigquery.storage.v1beta1.Storage$Stream`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^BigQueryStorageClient this ^com.google.cloud.bigquery.storage.v1beta1.Storage$Stream stream]
    (-> this (.finalizeStream stream))))

(defn close
  ""
  ([^BigQueryStorageClient this]
    (-> this (.close))))

(defn read-rows-callable
  "Reads rows from the table in the format prescribed by the read session. Each response contains
   one or more table rows, up to a maximum of 10 MiB per response; read requests which attempt to
   read individual rows larger than this will fail.

   Each request also returns a set of stream statistics reflecting the estimated total number
   of rows in the read stream. This number is computed based on the total table size and the
   number of active streams in the read session, and may change as other streams continue to read
   data.

   Sample code:



   try (BigQueryStorageClient bigQueryStorageClient = BigQueryStorageClient.create()) {
     StreamPosition readPosition = StreamPosition.newBuilder().build();
     ReadRowsRequest request = ReadRowsRequest.newBuilder()
       .setReadPosition(readPosition)
       .build();

     ServerStream<ReadRowsResponse> stream = bigQueryStorageClient.readRowsCallable().call(request);
     for (ReadRowsResponse response : stream) {
       // Do something when receive a response
     }
   }

  returns: `com.google.api.gax.rpc.ServerStreamingCallable<com.google.cloud.bigquery.storage.v1beta1.Storage$ReadRowsRequest,com.google.cloud.bigquery.storage.v1beta1.Storage$ReadRowsResponse>`"
  (^com.google.api.gax.rpc.ServerStreamingCallable [^BigQueryStorageClient this]
    (-> this (.readRowsCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^BigQueryStorageClient this]
    (-> this (.isTerminated))))

(defn split-read-stream-callable
  "Splits a given read stream into two Streams. These streams are referred to as the primary and
   the residual of the split. The original stream can still be read from in the same manner as
   before. Both of the returned streams can also be read from, and the total rows return by both
   child streams will be the same as the rows read from the original stream.

   Moreover, the two child streams will be allocated back to back in the original Stream.
   Concretely, it is guaranteed that for streams Original, Primary, and Residual, that
   Original[0-j] = Primary[0-j] and Original[j-n] = Residual[0-m] once the streams have been read
   to completion.

   This method is guaranteed to be idempotent.

   Sample code:



   try (BigQueryStorageClient bigQueryStorageClient = BigQueryStorageClient.create()) {
     Stream originalStream = Stream.newBuilder().build();
     SplitReadStreamRequest request = SplitReadStreamRequest.newBuilder()
       .setOriginalStream(originalStream)
       .build();
     ApiFuture<SplitReadStreamResponse> future = bigQueryStorageClient.splitReadStreamCallable().futureCall(request);
     // Do something
     SplitReadStreamResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.storage.v1beta1.Storage$SplitReadStreamRequest,com.google.cloud.bigquery.storage.v1beta1.Storage$SplitReadStreamResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BigQueryStorageClient this]
    (-> this (.splitReadStreamCallable))))

(defn shutdown-now
  ""
  ([^BigQueryStorageClient this]
    (-> this (.shutdownNow))))

(defn finalize-stream-callable
  "Triggers the graceful termination of a single stream in a ReadSession. This API can be used to
   dynamically adjust the parallelism of a batch processing task downwards without losing data.

   This API does not delete the stream -- it remains visible in the ReadSession, and any data
   processed by the stream is not released to other streams. However, no additional data will be
   assigned to the stream once this call completes. Callers must continue reading data on the
   stream until the end of the stream is reached so that data which has already been assigned to
   the stream will be processed.

   This method will return an error if there are no other live streams in the Session, or if
   SplitReadStream() has been called on the given Stream.

   Sample code:



   try (BigQueryStorageClient bigQueryStorageClient = BigQueryStorageClient.create()) {
     Stream stream = Stream.newBuilder().build();
     FinalizeStreamRequest request = FinalizeStreamRequest.newBuilder()
       .setStream(stream)
       .build();
     ApiFuture<Void> future = bigQueryStorageClient.finalizeStreamCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.storage.v1beta1.Storage$FinalizeStreamRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^BigQueryStorageClient this]
    (-> this (.finalizeStreamCallable))))

