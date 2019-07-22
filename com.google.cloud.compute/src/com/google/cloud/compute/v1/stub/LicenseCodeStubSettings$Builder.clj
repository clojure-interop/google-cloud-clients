(ns com.google.cloud.compute.v1.stub.LicenseCodeStubSettings$Builder
  "Builder for LicenseCodeStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub LicenseCodeStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.LicenseCodeStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.LicenseCodeStubSettings$Builder [^LicenseCodeStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^LicenseCodeStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn get-license-code-settings
  "Returns the builder for the settings used for calls to getLicenseCode.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetLicenseCodeHttpRequest,com.google.cloud.compute.v1.LicenseCode>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^LicenseCodeStubSettings$Builder this]
    (-> this (.getLicenseCodeSettings))))

(defn test-iam-permissions-license-code-settings
  "Returns the builder for the settings used for calls to testIamPermissionsLicenseCode.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.TestIamPermissionsLicenseCodeHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^LicenseCodeStubSettings$Builder this]
    (-> this (.testIamPermissionsLicenseCodeSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.LicenseCodeStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.LicenseCodeStubSettings [^LicenseCodeStubSettings$Builder this]
    (-> this (.build))))

