(ns com.google.cloud.compute.v1.NodeTemplateSettings$Builder
  "Builder for NodeTemplateSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NodeTemplateSettings$Builder]))

(defn insert-node-template-settings
  "Returns the builder for the settings used for calls to insertNodeTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertNodeTemplateHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NodeTemplateSettings$Builder this]
    (-> this (.insertNodeTemplateSettings))))

(defn set-iam-policy-node-template-settings
  "Returns the builder for the settings used for calls to setIamPolicyNodeTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetIamPolicyNodeTemplateHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NodeTemplateSettings$Builder this]
    (-> this (.setIamPolicyNodeTemplateSettings))))

(defn aggregated-list-node-templates-settings
  "Returns the builder for the settings used for calls to aggregatedListNodeTemplates.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.AggregatedListNodeTemplatesHttpRequest,com.google.cloud.compute.v1.NodeTemplateAggregatedList,com.google.cloud.compute.v1.NodeTemplateClient$AggregatedListNodeTemplatesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^NodeTemplateSettings$Builder this]
    (-> this (.aggregatedListNodeTemplatesSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.NodeTemplateSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.NodeTemplateSettings$Builder [^NodeTemplateSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn get-iam-policy-node-template-settings
  "Returns the builder for the settings used for calls to getIamPolicyNodeTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetIamPolicyNodeTemplateHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NodeTemplateSettings$Builder this]
    (-> this (.getIamPolicyNodeTemplateSettings))))

(defn test-iam-permissions-node-template-settings
  "Returns the builder for the settings used for calls to testIamPermissionsNodeTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.TestIamPermissionsNodeTemplateHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NodeTemplateSettings$Builder this]
    (-> this (.testIamPermissionsNodeTemplateSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.NodeTemplateSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.NodeTemplateSettings [^NodeTemplateSettings$Builder this]
    (-> this (.build))))

(defn get-node-template-settings
  "Returns the builder for the settings used for calls to getNodeTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetNodeTemplateHttpRequest,com.google.cloud.compute.v1.NodeTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NodeTemplateSettings$Builder this]
    (-> this (.getNodeTemplateSettings))))

(defn list-node-templates-settings
  "Returns the builder for the settings used for calls to listNodeTemplates.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListNodeTemplatesHttpRequest,com.google.cloud.compute.v1.NodeTemplateList,com.google.cloud.compute.v1.NodeTemplateClient$ListNodeTemplatesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^NodeTemplateSettings$Builder this]
    (-> this (.listNodeTemplatesSettings))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.compute.v1.stub.NodeTemplateStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.NodeTemplateStubSettings$Builder [^NodeTemplateSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn delete-node-template-settings
  "Returns the builder for the settings used for calls to deleteNodeTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteNodeTemplateHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^NodeTemplateSettings$Builder this]
    (-> this (.deleteNodeTemplateSettings))))

