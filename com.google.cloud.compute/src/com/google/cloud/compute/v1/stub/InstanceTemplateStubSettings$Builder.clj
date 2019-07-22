(ns com.google.cloud.compute.v1.stub.InstanceTemplateStubSettings$Builder
  "Builder for InstanceTemplateStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub InstanceTemplateStubSettings$Builder]))

(defn list-instance-templates-settings
  "Returns the builder for the settings used for calls to listInstanceTemplates.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListInstanceTemplatesHttpRequest,com.google.cloud.compute.v1.InstanceTemplateList,com.google.cloud.compute.v1.InstanceTemplateClient$ListInstanceTemplatesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^InstanceTemplateStubSettings$Builder this]
    (-> this (.listInstanceTemplatesSettings))))

(defn insert-instance-template-settings
  "Returns the builder for the settings used for calls to insertInstanceTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertInstanceTemplateHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceTemplateStubSettings$Builder this]
    (-> this (.insertInstanceTemplateSettings))))

(defn test-iam-permissions-instance-template-settings
  "Returns the builder for the settings used for calls to testIamPermissionsInstanceTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.TestIamPermissionsInstanceTemplateHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceTemplateStubSettings$Builder this]
    (-> this (.testIamPermissionsInstanceTemplateSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.InstanceTemplateStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.InstanceTemplateStubSettings$Builder [^InstanceTemplateStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn get-iam-policy-instance-template-settings
  "Returns the builder for the settings used for calls to getIamPolicyInstanceTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetIamPolicyInstanceTemplateHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceTemplateStubSettings$Builder this]
    (-> this (.getIamPolicyInstanceTemplateSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.InstanceTemplateStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.InstanceTemplateStubSettings [^InstanceTemplateStubSettings$Builder this]
    (-> this (.build))))

(defn set-iam-policy-instance-template-settings
  "Returns the builder for the settings used for calls to setIamPolicyInstanceTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetIamPolicyInstanceTemplateHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceTemplateStubSettings$Builder this]
    (-> this (.setIamPolicyInstanceTemplateSettings))))

(defn get-instance-template-settings
  "Returns the builder for the settings used for calls to getInstanceTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetInstanceTemplateHttpRequest,com.google.cloud.compute.v1.InstanceTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceTemplateStubSettings$Builder this]
    (-> this (.getInstanceTemplateSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^InstanceTemplateStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn delete-instance-template-settings
  "Returns the builder for the settings used for calls to deleteInstanceTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteInstanceTemplateHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^InstanceTemplateStubSettings$Builder this]
    (-> this (.deleteInstanceTemplateSettings))))

