(ns com.google.cloud.devtools.containeranalysis.v1.ContainerAnalysisSettings$Builder
  "Builder for ContainerAnalysisSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.devtools.containeranalysis.v1 ContainerAnalysisSettings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.devtools.containeranalysis.v1.stub.ContainerAnalysisStubSettings$Builder`"
  (^com.google.cloud.devtools.containeranalysis.v1.stub.ContainerAnalysisStubSettings$Builder [^ContainerAnalysisSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.devtools.containeranalysis.v1.ContainerAnalysisSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.devtools.containeranalysis.v1.ContainerAnalysisSettings$Builder [^ContainerAnalysisSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn set-iam-policy-settings
  "Returns the builder for the settings used for calls to setIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ContainerAnalysisSettings$Builder this]
    (-> this (.setIamPolicySettings))))

(defn get-iam-policy-settings
  "Returns the builder for the settings used for calls to getIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ContainerAnalysisSettings$Builder this]
    (-> this (.getIamPolicySettings))))

(defn test-iam-permissions-settings
  "Returns the builder for the settings used for calls to testIamPermissions.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ContainerAnalysisSettings$Builder this]
    (-> this (.testIamPermissionsSettings))))

(defn build
  "returns: `com.google.cloud.devtools.containeranalysis.v1.ContainerAnalysisSettings`

  throws: java.io.IOException"
  (^com.google.cloud.devtools.containeranalysis.v1.ContainerAnalysisSettings [^ContainerAnalysisSettings$Builder this]
    (-> this (.build))))

