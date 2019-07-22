(ns com.google.cloud.errorreporting.v1beta1.ReportErrorsServiceSettings
  "Settings class to configure an instance of ReportErrorsServiceClient.

  The default instance has everything set to sensible defaults:


    The default service address (clouderrorreporting.googleapis.com) and default port (443) are
        used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of reportErrorEvent to 30 seconds:



  ReportErrorsServiceSettings.Builder reportErrorsServiceSettingsBuilder =
      ReportErrorsServiceSettings.newBuilder();
  reportErrorsServiceSettingsBuilder.reportErrorEventSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  ReportErrorsServiceSettings reportErrorsServiceSettings = reportErrorsServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.errorreporting.v1beta1 ReportErrorsServiceSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (ReportErrorsServiceSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (ReportErrorsServiceSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (ReportErrorsServiceSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.errorreporting.v1beta1.ReportErrorsServiceSettings$Builder`"
  (^com.google.cloud.errorreporting.v1beta1.ReportErrorsServiceSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (ReportErrorsServiceSettings/newBuilder client-context))
  (^com.google.cloud.errorreporting.v1beta1.ReportErrorsServiceSettings$Builder []
    (ReportErrorsServiceSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (ReportErrorsServiceSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.errorreporting.v1beta1.stub.ReportErrorsServiceStubSettings`

  returns: `com.google.cloud.errorreporting.v1beta1.ReportErrorsServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.errorreporting.v1beta1.ReportErrorsServiceSettings [^com.google.cloud.errorreporting.v1beta1.stub.ReportErrorsServiceStubSettings stub]
    (ReportErrorsServiceSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (ReportErrorsServiceSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (ReportErrorsServiceSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (ReportErrorsServiceSettings/getDefaultServiceScopes )))

(defn report-error-event-settings
  "Returns the object with the settings used for calls to reportErrorEvent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest,com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ReportErrorsServiceSettings this]
    (-> this (.reportErrorEventSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.errorreporting.v1beta1.ReportErrorsServiceSettings$Builder`"
  (^com.google.cloud.errorreporting.v1beta1.ReportErrorsServiceSettings$Builder [^ReportErrorsServiceSettings this]
    (-> this (.toBuilder))))

