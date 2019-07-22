(ns com.google.cloud.recaptchaenterprise.v1beta1.stub.RecaptchaEnterpriseServiceV1Beta1StubSettings
  "Settings class to configure an instance of RecaptchaEnterpriseServiceV1Beta1Stub.

  The default instance has everything set to sensible defaults:


    The default service address (recaptchaenterprise.googleapis.com) and default port (443) are
        used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of createAssessment to 30 seconds:



  RecaptchaEnterpriseServiceV1Beta1StubSettings.Builder recaptchaEnterpriseServiceV1Beta1SettingsBuilder =
      RecaptchaEnterpriseServiceV1Beta1StubSettings.newBuilder();
  recaptchaEnterpriseServiceV1Beta1SettingsBuilder.createAssessmentSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  RecaptchaEnterpriseServiceV1Beta1StubSettings recaptchaEnterpriseServiceV1Beta1Settings = recaptchaEnterpriseServiceV1Beta1SettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.recaptchaenterprise.v1beta1.stub RecaptchaEnterpriseServiceV1Beta1StubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (RecaptchaEnterpriseServiceV1Beta1StubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (RecaptchaEnterpriseServiceV1Beta1StubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (RecaptchaEnterpriseServiceV1Beta1StubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (RecaptchaEnterpriseServiceV1Beta1StubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (RecaptchaEnterpriseServiceV1Beta1StubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (RecaptchaEnterpriseServiceV1Beta1StubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (RecaptchaEnterpriseServiceV1Beta1StubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.recaptchaenterprise.v1beta1.stub.RecaptchaEnterpriseServiceV1Beta1StubSettings$Builder`"
  (^com.google.cloud.recaptchaenterprise.v1beta1.stub.RecaptchaEnterpriseServiceV1Beta1StubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (RecaptchaEnterpriseServiceV1Beta1StubSettings/newBuilder client-context))
  (^com.google.cloud.recaptchaenterprise.v1beta1.stub.RecaptchaEnterpriseServiceV1Beta1StubSettings$Builder []
    (RecaptchaEnterpriseServiceV1Beta1StubSettings/newBuilder )))

(defn create-assessment-settings
  "Returns the object with the settings used for calls to createAssessment.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.recaptchaenterprise.v1beta1.CreateAssessmentRequest,com.google.recaptchaenterprise.v1beta1.Assessment>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RecaptchaEnterpriseServiceV1Beta1StubSettings this]
    (-> this (.createAssessmentSettings))))

(defn annotate-assessment-settings
  "Returns the object with the settings used for calls to annotateAssessment.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentRequest,com.google.recaptchaenterprise.v1beta1.AnnotateAssessmentResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RecaptchaEnterpriseServiceV1Beta1StubSettings this]
    (-> this (.annotateAssessmentSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.recaptchaenterprise.v1beta1.stub.RecaptchaEnterpriseServiceV1Beta1Stub`

  throws: java.io.IOException"
  ([^RecaptchaEnterpriseServiceV1Beta1StubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.recaptchaenterprise.v1beta1.stub.RecaptchaEnterpriseServiceV1Beta1StubSettings$Builder`"
  (^com.google.cloud.recaptchaenterprise.v1beta1.stub.RecaptchaEnterpriseServiceV1Beta1StubSettings$Builder [^RecaptchaEnterpriseServiceV1Beta1StubSettings this]
    (-> this (.toBuilder))))

