(ns com.google.cloud.bigtable.data.v2.stub.EnhancedBigtableStubSettings
  "Settings class to configure an instance of EnhancedBigtableStub.

  Sane defaults are provided for most settings:


    The default service address (bigtable.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The only required setting is the instance name.

  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object.



  BigtableDataSettings.Builder settingsBuilder = BigtableDataSettings.newBuilder()
    .setProjectId(\"my-project-id\")
    .setInstanceId(\"my-instance-id\")
    .setAppProfileId(\"default\");

  settingsBuilder.readRowsSettings()
   .setRetryableCodes(Code.DEADLINE_EXCEEDED, Code.UNAVAILABLE);

  BigtableDataSettings settings = builder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2.stub EnhancedBigtableStubSettings]))

(defn *new-builder
  "Create a new builder.

  returns: `com.google.cloud.bigtable.data.v2.stub.EnhancedBigtableStubSettings$Builder`"
  (^com.google.cloud.bigtable.data.v2.stub.EnhancedBigtableStubSettings$Builder []
    (EnhancedBigtableStubSettings/newBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (EnhancedBigtableStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (EnhancedBigtableStubSettings/defaultTransportChannelProvider )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (EnhancedBigtableStubSettings/defaultCredentialsProviderBuilder )))

(defn get-project-id
  "Returns the project id of the target instance.

  returns: `java.lang.String`"
  (^java.lang.String [^EnhancedBigtableStubSettings this]
    (-> this (.getProjectId))))

(defn mutate-row-settings
  "Returns the object with the settings used for calls to MutateRow.

   This is an idempotent and non-streaming operation.

   Default retry and timeout settings:


     Retry error codes are: StatusCode.Code.DEADLINE_EXCEEDED and StatusCode.Code.UNAVAILABLE.
     RetryDelay between failed attempts starts at 100ms and increases
         exponentially by a factor of 1.3 until a maximum of 60 seconds.
     The default timeout for each attempt is 20
         seconds and the timeout for the entire
         operation across all of the attempts is 10 mins.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.bigtable.data.v2.models.RowMutation,java.lang.Void>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^EnhancedBigtableStubSettings this]
    (-> this (.mutateRowSettings))))

(defn bulk-mutate-rows-settings
  "Returns the object with the settings used for calls to MutateRows.

   Please note that these settings will affect both manually batched calls
   (bulkMutateRowsCallable) and automatic batched calls (bulkMutateRowsBatchingCallable). The
   RowMutation request signature is ignored for the manual batched calls.

   Default retry and timeout settings:


     Retry error codes are: StatusCode.Code.DEADLINE_EXCEEDED, StatusCode.Code.UNAVAILABLE and StatusCode.Code.ABORTED.
     RetryDelay between failed attempts starts at 100ms and increases
         exponentially by a factor of 1.3 until a maximum of 60 seconds.
     The default timeout for each attempt is 20
         seconds and the timeout for the entire
         operation across all of the attempts is 10 mins.


   On breach of certain triggers, the operation initiates processing of accumulated request for
   which the default settings are:


     When the request count reaches
         100.
     When accumulated request size
         reaches to 20MB.
     When an interval of 1 second passes
         after batching initialization or last processed batch.


   When the pending request
   count reaches a default of 1000 or their accumulated size reaches default
   value of 100MB, then this operation will by default be blocked until some of the pending batch
   are resolved.

  returns: `com.google.api.gax.rpc.BatchingCallSettings<com.google.cloud.bigtable.data.v2.models.RowMutation,java.lang.Void>`"
  (^com.google.api.gax.rpc.BatchingCallSettings [^EnhancedBigtableStubSettings this]
    (-> this (.bulkMutateRowsSettings))))

(defn sample-row-keys-settings
  "Returns the object with the settings used for calls to SampleRowKeys.

   This is idempotent and non-streaming operation.

   Default retry and timeout settings:


     Retry error codes are: StatusCode.Code.DEADLINE_EXCEEDED and StatusCode.Code.UNAVAILABLE.
     RetryDelay between failed attempts starts at 100ms and increases
         exponentially by a factor of 1.3 until a maximum of 60 seconds.
     The default timeout for each attempt is 20
         seconds and the timeout for the entire
         operation across all of the attempts is 10 mins.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<java.lang.String,java.util.List<com.google.cloud.bigtable.data.v2.models.KeyOffset>>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^EnhancedBigtableStubSettings this]
    (-> this (.sampleRowKeysSettings))))

(defn read-rows-settings
  "Returns the object with the settings used for calls to ReadRows.

   This is idempotent and streaming operation.

   Default retry and timeout settings:


     Default idle timeout is set to
         5 mins.
     Retry error codes are:
         StatusCode.Code.DEADLINE_EXCEEDED and StatusCode.Code.UNAVAILABLE.
     RetryDelay between failed attempts starts at 100ms and increases
         exponentially by a factor of 1.3 until a maximum of 60 seconds.
     The default read timeout for each row in a
         response stream is 20 seconds and the timeout to read the entire stream is 1 hour.

  returns: `com.google.api.gax.rpc.ServerStreamingCallSettings<com.google.cloud.bigtable.data.v2.models.Query,com.google.cloud.bigtable.data.v2.models.Row>`"
  (^com.google.api.gax.rpc.ServerStreamingCallSettings [^EnhancedBigtableStubSettings this]
    (-> this (.readRowsSettings))))

(defn check-and-mutate-row-settings
  "Returns the object with the settings used for calls to CheckAndMutateRow.

   This is a non-idempotent and non-streaming operation.

   By default this operation does not reattempt in case of RPC failure. The default timeout for
   the entire operation is 10 mins.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.bigtable.data.v2.models.ConditionalRowMutation,java.lang.Boolean>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^EnhancedBigtableStubSettings this]
    (-> this (.checkAndMutateRowSettings))))

(defn get-app-profile-id
  "Returns the configured AppProfile to use

  returns: `java.lang.String`"
  (^java.lang.String [^EnhancedBigtableStubSettings this]
    (-> this (.getAppProfileId))))

(defn read-modify-write-row-settings
  "Returns the object with the settings used for calls to ReadModifyWriteRow.

   This is a non-idempotent and non-streaming operation.

   By default this operation does not reattempt in case of RPC failure. The default timeout for
   the entire operation is 10 mins.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.bigtable.data.v2.models.ReadModifyWriteRow,com.google.cloud.bigtable.data.v2.models.Row>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^EnhancedBigtableStubSettings this]
    (-> this (.readModifyWriteRowSettings))))

(defn get-instance-id
  "Returns the target instance id.

  returns: `java.lang.String`"
  (^java.lang.String [^EnhancedBigtableStubSettings this]
    (-> this (.getInstanceId))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.bigtable.data.v2.stub.EnhancedBigtableStubSettings$Builder`"
  (^com.google.cloud.bigtable.data.v2.stub.EnhancedBigtableStubSettings$Builder [^EnhancedBigtableStubSettings this]
    (-> this (.toBuilder))))

(defn read-row-settings
  "Returns the object with the settings used for point reads via ReadRows.

   This is an idempotent and non-streaming operation.

   Default retry and timeout settings:


     Retry error codes are: StatusCode.Code.DEADLINE_EXCEEDED and StatusCode.Code.UNAVAILABLE.
     RetryDelay between failed attempts starts at 100ms and increases
         exponentially by a factor of 1.3 until a maximum of 60 seconds.
     The default timeout for each attempt is 20
         seconds and the timeout for the entire
         operation across all of the attempts is 10 mins.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.bigtable.data.v2.models.Query,com.google.cloud.bigtable.data.v2.models.Row>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^EnhancedBigtableStubSettings this]
    (-> this (.readRowSettings))))

