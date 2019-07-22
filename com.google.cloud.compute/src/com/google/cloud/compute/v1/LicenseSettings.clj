(ns com.google.cloud.compute.v1.LicenseSettings
  "Settings class to configure an instance of LicenseClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteLicense to 30 seconds:



  LicenseSettings.Builder licenseSettingsBuilder =
      LicenseSettings.newBuilder();
  licenseSettingsBuilder.deleteLicenseSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  LicenseSettings licenseSettings = licenseSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 LicenseSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (LicenseSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (LicenseSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (LicenseSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (LicenseSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.LicenseSettings$Builder`"
  (^com.google.cloud.compute.v1.LicenseSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (LicenseSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.LicenseSettings$Builder []
    (LicenseSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (LicenseSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (LicenseSettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.LicenseStubSettings`

  returns: `com.google.cloud.compute.v1.LicenseSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.LicenseSettings [^com.google.cloud.compute.v1.stub.LicenseStubSettings stub]
    (LicenseSettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (LicenseSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (LicenseSettings/getDefaultServiceScopes )))

(defn delete-license-settings
  "Returns the object with the settings used for calls to deleteLicense.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteLicenseHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^LicenseSettings this]
    (-> this (.deleteLicenseSettings))))

(defn get-license-settings
  "Returns the object with the settings used for calls to getLicense.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetLicenseHttpRequest,com.google.cloud.compute.v1.License>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^LicenseSettings this]
    (-> this (.getLicenseSettings))))

(defn get-iam-policy-license-settings
  "Returns the object with the settings used for calls to getIamPolicyLicense.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetIamPolicyLicenseHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^LicenseSettings this]
    (-> this (.getIamPolicyLicenseSettings))))

(defn insert-license-settings
  "Returns the object with the settings used for calls to insertLicense.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertLicenseHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^LicenseSettings this]
    (-> this (.insertLicenseSettings))))

(defn list-licenses-settings
  "Returns the object with the settings used for calls to listLicenses.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListLicensesHttpRequest,com.google.cloud.compute.v1.LicensesListResponse,com.google.cloud.compute.v1.LicenseClient$ListLicensesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^LicenseSettings this]
    (-> this (.listLicensesSettings))))

(defn set-iam-policy-license-settings
  "Returns the object with the settings used for calls to setIamPolicyLicense.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetIamPolicyLicenseHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^LicenseSettings this]
    (-> this (.setIamPolicyLicenseSettings))))

(defn test-iam-permissions-license-settings
  "Returns the object with the settings used for calls to testIamPermissionsLicense.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.TestIamPermissionsLicenseHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^LicenseSettings this]
    (-> this (.testIamPermissionsLicenseSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.LicenseSettings$Builder`"
  (^com.google.cloud.compute.v1.LicenseSettings$Builder [^LicenseSettings this]
    (-> this (.toBuilder))))

