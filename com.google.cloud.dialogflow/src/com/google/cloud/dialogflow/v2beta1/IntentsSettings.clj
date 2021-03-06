(ns com.google.cloud.dialogflow.v2beta1.IntentsSettings
  "Settings class to configure an instance of IntentsClient.

  The default instance has everything set to sensible defaults:


    The default service address (dialogflow.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getIntent to 30 seconds:



  IntentsSettings.Builder intentsSettingsBuilder =
      IntentsSettings.newBuilder();
  intentsSettingsBuilder.getIntentSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  IntentsSettings intentsSettings = intentsSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2beta1 IntentsSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (IntentsSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (IntentsSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (IntentsSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.dialogflow.v2beta1.IntentsSettings$Builder`"
  (^com.google.cloud.dialogflow.v2beta1.IntentsSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (IntentsSettings/newBuilder client-context))
  (^com.google.cloud.dialogflow.v2beta1.IntentsSettings$Builder []
    (IntentsSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (IntentsSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.dialogflow.v2beta1.stub.IntentsStubSettings`

  returns: `com.google.cloud.dialogflow.v2beta1.IntentsSettings`

  throws: java.io.IOException"
  (^com.google.cloud.dialogflow.v2beta1.IntentsSettings [^com.google.cloud.dialogflow.v2beta1.stub.IntentsStubSettings stub]
    (IntentsSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (IntentsSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (IntentsSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (IntentsSettings/getDefaultServiceScopes )))

(defn get-intent-settings
  "Returns the object with the settings used for calls to getIntent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.GetIntentRequest,com.google.cloud.dialogflow.v2beta1.Intent>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^IntentsSettings this]
    (-> this (.getIntentSettings))))

(defn delete-intent-settings
  "Returns the object with the settings used for calls to deleteIntent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.DeleteIntentRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^IntentsSettings this]
    (-> this (.deleteIntentSettings))))

(defn batch-delete-intents-settings
  "Returns the object with the settings used for calls to batchDeleteIntents.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^IntentsSettings this]
    (-> this (.batchDeleteIntentsSettings))))

(defn list-intents-settings
  "Returns the object with the settings used for calls to listIntents.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.dialogflow.v2beta1.ListIntentsRequest,com.google.cloud.dialogflow.v2beta1.ListIntentsResponse,com.google.cloud.dialogflow.v2beta1.IntentsClient$ListIntentsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^IntentsSettings this]
    (-> this (.listIntentsSettings))))

(defn batch-update-intents-settings
  "Returns the object with the settings used for calls to batchUpdateIntents.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.BatchUpdateIntentsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^IntentsSettings this]
    (-> this (.batchUpdateIntentsSettings))))

(defn create-intent-settings
  "Returns the object with the settings used for calls to createIntent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.CreateIntentRequest,com.google.cloud.dialogflow.v2beta1.Intent>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^IntentsSettings this]
    (-> this (.createIntentSettings))))

(defn batch-update-intents-operation-settings
  "Returns the object with the settings used for calls to batchUpdateIntents.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.dialogflow.v2beta1.BatchUpdateIntentsRequest,com.google.cloud.dialogflow.v2beta1.BatchUpdateIntentsResponse,com.google.protobuf.Struct>`"
  ([^IntentsSettings this]
    (-> this (.batchUpdateIntentsOperationSettings))))

(defn batch-delete-intents-operation-settings
  "Returns the object with the settings used for calls to batchDeleteIntents.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.dialogflow.v2beta1.BatchDeleteIntentsRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^IntentsSettings this]
    (-> this (.batchDeleteIntentsOperationSettings))))

(defn update-intent-settings
  "Returns the object with the settings used for calls to updateIntent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dialogflow.v2beta1.UpdateIntentRequest,com.google.cloud.dialogflow.v2beta1.Intent>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^IntentsSettings this]
    (-> this (.updateIntentSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.dialogflow.v2beta1.IntentsSettings$Builder`"
  (^com.google.cloud.dialogflow.v2beta1.IntentsSettings$Builder [^IntentsSettings this]
    (-> this (.toBuilder))))

