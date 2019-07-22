(ns com.google.cloud.compute.v1.LicenseCodeSettings
  "Settings class to configure an instance of LicenseCodeClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getLicenseCode to 30 seconds:



  LicenseCodeSettings.Builder licenseCodeSettingsBuilder =
      LicenseCodeSettings.newBuilder();
  licenseCodeSettingsBuilder.getLicenseCodeSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  LicenseCodeSettings licenseCodeSettings = licenseCodeSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 LicenseCodeSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (LicenseCodeSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (LicenseCodeSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (LicenseCodeSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (LicenseCodeSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.LicenseCodeSettings$Builder`"
  (^com.google.cloud.compute.v1.LicenseCodeSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (LicenseCodeSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.LicenseCodeSettings$Builder []
    (LicenseCodeSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (LicenseCodeSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (LicenseCodeSettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.LicenseCodeStubSettings`

  returns: `com.google.cloud.compute.v1.LicenseCodeSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.LicenseCodeSettings [^com.google.cloud.compute.v1.stub.LicenseCodeStubSettings stub]
    (LicenseCodeSettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (LicenseCodeSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (LicenseCodeSettings/getDefaultServiceScopes )))

(defn get-license-code-settings
  "Returns the object with the settings used for calls to getLicenseCode.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetLicenseCodeHttpRequest,com.google.cloud.compute.v1.LicenseCode>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^LicenseCodeSettings this]
    (-> this (.getLicenseCodeSettings))))

(defn test-iam-permissions-license-code-settings
  "Returns the object with the settings used for calls to testIamPermissionsLicenseCode.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.TestIamPermissionsLicenseCodeHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^LicenseCodeSettings this]
    (-> this (.testIamPermissionsLicenseCodeSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.LicenseCodeSettings$Builder`"
  (^com.google.cloud.compute.v1.LicenseCodeSettings$Builder [^LicenseCodeSettings this]
    (-> this (.toBuilder))))

