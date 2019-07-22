(ns com.google.cloud.compute.v1.LicenseSettings$Builder
  "Builder for LicenseSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 LicenseSettings$Builder]))

(defn get-license-settings
  "Returns the builder for the settings used for calls to getLicense.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetLicenseHttpRequest,com.google.cloud.compute.v1.License>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^LicenseSettings$Builder this]
    (-> this (.getLicenseSettings))))

(defn get-iam-policy-license-settings
  "Returns the builder for the settings used for calls to getIamPolicyLicense.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetIamPolicyLicenseHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^LicenseSettings$Builder this]
    (-> this (.getIamPolicyLicenseSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.LicenseSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.LicenseSettings$Builder [^LicenseSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn set-iam-policy-license-settings
  "Returns the builder for the settings used for calls to setIamPolicyLicense.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetIamPolicyLicenseHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^LicenseSettings$Builder this]
    (-> this (.setIamPolicyLicenseSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.LicenseSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.LicenseSettings [^LicenseSettings$Builder this]
    (-> this (.build))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.compute.v1.stub.LicenseStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.LicenseStubSettings$Builder [^LicenseSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn delete-license-settings
  "Returns the builder for the settings used for calls to deleteLicense.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteLicenseHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^LicenseSettings$Builder this]
    (-> this (.deleteLicenseSettings))))

(defn list-licenses-settings
  "Returns the builder for the settings used for calls to listLicenses.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListLicensesHttpRequest,com.google.cloud.compute.v1.LicensesListResponse,com.google.cloud.compute.v1.LicenseClient$ListLicensesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^LicenseSettings$Builder this]
    (-> this (.listLicensesSettings))))

(defn insert-license-settings
  "Returns the builder for the settings used for calls to insertLicense.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertLicenseHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^LicenseSettings$Builder this]
    (-> this (.insertLicenseSettings))))

(defn test-iam-permissions-license-settings
  "Returns the builder for the settings used for calls to testIamPermissionsLicense.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.TestIamPermissionsLicenseHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^LicenseSettings$Builder this]
    (-> this (.testIamPermissionsLicenseSettings))))

