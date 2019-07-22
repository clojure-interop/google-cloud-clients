(ns com.google.cloud.talent.v4beta1.CompletionSettings
  "Settings class to configure an instance of CompletionClient.

  The default instance has everything set to sensible defaults:


    The default service address (jobs.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of completeQuery to 30 seconds:



  CompletionSettings.Builder completionSettingsBuilder =
      CompletionSettings.newBuilder();
  completionSettingsBuilder.completeQuerySettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  CompletionSettings completionSettings = completionSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1 CompletionSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (CompletionSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (CompletionSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (CompletionSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.talent.v4beta1.CompletionSettings$Builder`"
  (^com.google.cloud.talent.v4beta1.CompletionSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (CompletionSettings/newBuilder client-context))
  (^com.google.cloud.talent.v4beta1.CompletionSettings$Builder []
    (CompletionSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (CompletionSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.talent.v4beta1.stub.CompletionStubSettings`

  returns: `com.google.cloud.talent.v4beta1.CompletionSettings`

  throws: java.io.IOException"
  (^com.google.cloud.talent.v4beta1.CompletionSettings [^com.google.cloud.talent.v4beta1.stub.CompletionStubSettings stub]
    (CompletionSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (CompletionSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (CompletionSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (CompletionSettings/getDefaultServiceScopes )))

(defn complete-query-settings
  "Returns the object with the settings used for calls to completeQuery.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.talent.v4beta1.CompleteQueryRequest,com.google.cloud.talent.v4beta1.CompleteQueryResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^CompletionSettings this]
    (-> this (.completeQuerySettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.talent.v4beta1.CompletionSettings$Builder`"
  (^com.google.cloud.talent.v4beta1.CompletionSettings$Builder [^CompletionSettings this]
    (-> this (.toBuilder))))

