(ns com.google.cloud.compute.v1.NodeTemplateSettings
  "Settings class to configure an instance of NodeTemplateClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteNodeTemplate to 30 seconds:



  NodeTemplateSettings.Builder nodeTemplateSettingsBuilder =
      NodeTemplateSettings.newBuilder();
  nodeTemplateSettingsBuilder.deleteNodeTemplateSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  NodeTemplateSettings nodeTemplateSettings = nodeTemplateSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NodeTemplateSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (NodeTemplateSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (NodeTemplateSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (NodeTemplateSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (NodeTemplateSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.NodeTemplateSettings$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplateSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (NodeTemplateSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.NodeTemplateSettings$Builder []
    (NodeTemplateSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (NodeTemplateSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (NodeTemplateSettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.NodeTemplateStubSettings`

  returns: `com.google.cloud.compute.v1.NodeTemplateSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.NodeTemplateSettings [^com.google.cloud.compute.v1.stub.NodeTemplateStubSettings stub]
    (NodeTemplateSettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (NodeTemplateSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (NodeTemplateSettings/getDefaultServiceScopes )))

(defn insert-node-template-settings
  "Returns the object with the settings used for calls to insertNodeTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertNodeTemplateHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NodeTemplateSettings this]
    (-> this (.insertNodeTemplateSettings))))

(defn set-iam-policy-node-template-settings
  "Returns the object with the settings used for calls to setIamPolicyNodeTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetIamPolicyNodeTemplateHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NodeTemplateSettings this]
    (-> this (.setIamPolicyNodeTemplateSettings))))

(defn aggregated-list-node-templates-settings
  "Returns the object with the settings used for calls to aggregatedListNodeTemplates.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.AggregatedListNodeTemplatesHttpRequest,com.google.cloud.compute.v1.NodeTemplateAggregatedList,com.google.cloud.compute.v1.NodeTemplateClient$AggregatedListNodeTemplatesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^NodeTemplateSettings this]
    (-> this (.aggregatedListNodeTemplatesSettings))))

(defn get-iam-policy-node-template-settings
  "Returns the object with the settings used for calls to getIamPolicyNodeTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetIamPolicyNodeTemplateHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NodeTemplateSettings this]
    (-> this (.getIamPolicyNodeTemplateSettings))))

(defn test-iam-permissions-node-template-settings
  "Returns the object with the settings used for calls to testIamPermissionsNodeTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.TestIamPermissionsNodeTemplateHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NodeTemplateSettings this]
    (-> this (.testIamPermissionsNodeTemplateSettings))))

(defn get-node-template-settings
  "Returns the object with the settings used for calls to getNodeTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetNodeTemplateHttpRequest,com.google.cloud.compute.v1.NodeTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NodeTemplateSettings this]
    (-> this (.getNodeTemplateSettings))))

(defn list-node-templates-settings
  "Returns the object with the settings used for calls to listNodeTemplates.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListNodeTemplatesHttpRequest,com.google.cloud.compute.v1.NodeTemplateList,com.google.cloud.compute.v1.NodeTemplateClient$ListNodeTemplatesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^NodeTemplateSettings this]
    (-> this (.listNodeTemplatesSettings))))

(defn delete-node-template-settings
  "Returns the object with the settings used for calls to deleteNodeTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteNodeTemplateHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^NodeTemplateSettings this]
    (-> this (.deleteNodeTemplateSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.NodeTemplateSettings$Builder`"
  (^com.google.cloud.compute.v1.NodeTemplateSettings$Builder [^NodeTemplateSettings this]
    (-> this (.toBuilder))))

