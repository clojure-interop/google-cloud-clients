(ns com.google.cloud.compute.v1.stub.LicenseCodeStubSettings
  "Settings class to configure an instance of LicenseCodeStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getLicenseCode to 30 seconds:



  LicenseCodeStubSettings.Builder licenseCodeSettingsBuilder =
      LicenseCodeStubSettings.newBuilder();
  licenseCodeSettingsBuilder.getLicenseCodeSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  LicenseCodeStubSettings licenseCodeSettings = licenseCodeSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub LicenseCodeStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (LicenseCodeStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (LicenseCodeStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (LicenseCodeStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (LicenseCodeStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.LicenseCodeStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.LicenseCodeStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (LicenseCodeStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.LicenseCodeStubSettings$Builder []
    (LicenseCodeStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (LicenseCodeStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (LicenseCodeStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (LicenseCodeStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (LicenseCodeStubSettings/getDefaultServiceScopes )))

(defn get-license-code-settings
  "Returns the object with the settings used for calls to getLicenseCode.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetLicenseCodeHttpRequest,com.google.cloud.compute.v1.LicenseCode>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^LicenseCodeStubSettings this]
    (-> this (.getLicenseCodeSettings))))

(defn test-iam-permissions-license-code-settings
  "Returns the object with the settings used for calls to testIamPermissionsLicenseCode.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.TestIamPermissionsLicenseCodeHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^LicenseCodeStubSettings this]
    (-> this (.testIamPermissionsLicenseCodeSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.LicenseCodeStub`

  throws: java.io.IOException"
  ([^LicenseCodeStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.LicenseCodeStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.LicenseCodeStubSettings$Builder [^LicenseCodeStubSettings this]
    (-> this (.toBuilder))))

