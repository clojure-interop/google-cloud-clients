(ns com.google.cloud.compute.v1.LicenseCodeSettings$Builder
  "Builder for LicenseCodeSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 LicenseCodeSettings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.compute.v1.stub.LicenseCodeStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.LicenseCodeStubSettings$Builder [^LicenseCodeSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.LicenseCodeSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.LicenseCodeSettings$Builder [^LicenseCodeSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn get-license-code-settings
  "Returns the builder for the settings used for calls to getLicenseCode.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetLicenseCodeHttpRequest,com.google.cloud.compute.v1.LicenseCode>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^LicenseCodeSettings$Builder this]
    (-> this (.getLicenseCodeSettings))))

(defn test-iam-permissions-license-code-settings
  "Returns the builder for the settings used for calls to testIamPermissionsLicenseCode.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.TestIamPermissionsLicenseCodeHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^LicenseCodeSettings$Builder this]
    (-> this (.testIamPermissionsLicenseCodeSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.LicenseCodeSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.LicenseCodeSettings [^LicenseCodeSettings$Builder this]
    (-> this (.build))))

