(ns com.google.cloud.errorreporting.v1beta1.stub.ReportErrorsServiceStubSettings
  "Settings class to configure an instance of ReportErrorsServiceStub.

  The default instance has everything set to sensible defaults:


    The default service address (clouderrorreporting.googleapis.com) and default port (443) are
        used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of reportErrorEvent to 30 seconds:



  ReportErrorsServiceStubSettings.Builder reportErrorsServiceSettingsBuilder =
      ReportErrorsServiceStubSettings.newBuilder();
  reportErrorsServiceSettingsBuilder.reportErrorEventSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  ReportErrorsServiceStubSettings reportErrorsServiceSettings = reportErrorsServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.errorreporting.v1beta1.stub ReportErrorsServiceStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (ReportErrorsServiceStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (ReportErrorsServiceStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (ReportErrorsServiceStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (ReportErrorsServiceStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (ReportErrorsServiceStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (ReportErrorsServiceStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (ReportErrorsServiceStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.errorreporting.v1beta1.stub.ReportErrorsServiceStubSettings$Builder`"
  (^com.google.cloud.errorreporting.v1beta1.stub.ReportErrorsServiceStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (ReportErrorsServiceStubSettings/newBuilder client-context))
  (^com.google.cloud.errorreporting.v1beta1.stub.ReportErrorsServiceStubSettings$Builder []
    (ReportErrorsServiceStubSettings/newBuilder )))

(defn report-error-event-settings
  "Returns the object with the settings used for calls to reportErrorEvent.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest,com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ReportErrorsServiceStubSettings this]
    (-> this (.reportErrorEventSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.errorreporting.v1beta1.stub.ReportErrorsServiceStub`

  throws: java.io.IOException"
  ([^ReportErrorsServiceStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.errorreporting.v1beta1.stub.ReportErrorsServiceStubSettings$Builder`"
  (^com.google.cloud.errorreporting.v1beta1.stub.ReportErrorsServiceStubSettings$Builder [^ReportErrorsServiceStubSettings this]
    (-> this (.toBuilder))))

