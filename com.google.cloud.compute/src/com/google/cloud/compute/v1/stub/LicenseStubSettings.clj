(ns com.google.cloud.compute.v1.stub.LicenseStubSettings
  "Settings class to configure an instance of LicenseStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteLicense to 30 seconds:



  LicenseStubSettings.Builder licenseSettingsBuilder =
      LicenseStubSettings.newBuilder();
  licenseSettingsBuilder.deleteLicenseSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  LicenseStubSettings licenseSettings = licenseSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub LicenseStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (LicenseStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (LicenseStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (LicenseStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (LicenseStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.LicenseStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.LicenseStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (LicenseStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.LicenseStubSettings$Builder []
    (LicenseStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (LicenseStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (LicenseStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (LicenseStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (LicenseStubSettings/getDefaultServiceScopes )))

(defn get-license-settings
  "Returns the object with the settings used for calls to getLicense.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetLicenseHttpRequest,com.google.cloud.compute.v1.License>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^LicenseStubSettings this]
    (-> this (.getLicenseSettings))))

(defn get-iam-policy-license-settings
  "Returns the object with the settings used for calls to getIamPolicyLicense.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetIamPolicyLicenseHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^LicenseStubSettings this]
    (-> this (.getIamPolicyLicenseSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.LicenseStub`

  throws: java.io.IOException"
  ([^LicenseStubSettings this]
    (-> this (.createStub))))

(defn set-iam-policy-license-settings
  "Returns the object with the settings used for calls to setIamPolicyLicense.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetIamPolicyLicenseHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^LicenseStubSettings this]
    (-> this (.setIamPolicyLicenseSettings))))

(defn delete-license-settings
  "Returns the object with the settings used for calls to deleteLicense.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteLicenseHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^LicenseStubSettings this]
    (-> this (.deleteLicenseSettings))))

(defn list-licenses-settings
  "Returns the object with the settings used for calls to listLicenses.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListLicensesHttpRequest,com.google.cloud.compute.v1.LicensesListResponse,com.google.cloud.compute.v1.LicenseClient$ListLicensesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^LicenseStubSettings this]
    (-> this (.listLicensesSettings))))

(defn insert-license-settings
  "Returns the object with the settings used for calls to insertLicense.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertLicenseHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^LicenseStubSettings this]
    (-> this (.insertLicenseSettings))))

(defn test-iam-permissions-license-settings
  "Returns the object with the settings used for calls to testIamPermissionsLicense.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.TestIamPermissionsLicenseHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^LicenseStubSettings this]
    (-> this (.testIamPermissionsLicenseSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.LicenseStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.LicenseStubSettings$Builder [^LicenseStubSettings this]
    (-> this (.toBuilder))))

