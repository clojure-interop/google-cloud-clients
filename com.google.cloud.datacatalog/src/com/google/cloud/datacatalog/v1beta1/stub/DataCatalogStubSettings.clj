(ns com.google.cloud.datacatalog.v1beta1.stub.DataCatalogStubSettings
  "Settings class to configure an instance of DataCatalogStub.

  The default instance has everything set to sensible defaults:


    The default service address (datacatalog.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of updateEntry to 30 seconds:



  DataCatalogStubSettings.Builder dataCatalogSettingsBuilder =
      DataCatalogStubSettings.newBuilder();
  dataCatalogSettingsBuilder.updateEntrySettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  DataCatalogStubSettings dataCatalogSettings = dataCatalogSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datacatalog.v1beta1.stub DataCatalogStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (DataCatalogStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (DataCatalogStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (DataCatalogStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (DataCatalogStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (DataCatalogStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (DataCatalogStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (DataCatalogStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.datacatalog.v1beta1.stub.DataCatalogStubSettings$Builder`"
  (^com.google.cloud.datacatalog.v1beta1.stub.DataCatalogStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (DataCatalogStubSettings/newBuilder client-context))
  (^com.google.cloud.datacatalog.v1beta1.stub.DataCatalogStubSettings$Builder []
    (DataCatalogStubSettings/newBuilder )))

(defn search-catalog-settings
  "Returns the object with the settings used for calls to searchCatalog.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.datacatalog.SearchCatalogRequest,com.google.cloud.datacatalog.SearchCatalogResponse,com.google.cloud.datacatalog.v1beta1.DataCatalogClient$SearchCatalogPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DataCatalogStubSettings this]
    (-> this (.searchCatalogSettings))))

(defn create-tag-settings
  "Returns the object with the settings used for calls to createTag.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datacatalog.CreateTagRequest,com.google.cloud.datacatalog.Tag>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataCatalogStubSettings this]
    (-> this (.createTagSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.datacatalog.v1beta1.stub.DataCatalogStub`

  throws: java.io.IOException"
  ([^DataCatalogStubSettings this]
    (-> this (.createStub))))

(defn update-tag-template-field-settings
  "Returns the object with the settings used for calls to updateTagTemplateField.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datacatalog.UpdateTagTemplateFieldRequest,com.google.cloud.datacatalog.TagTemplateField>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataCatalogStubSettings this]
    (-> this (.updateTagTemplateFieldSettings))))

(defn lookup-entry-settings
  "Returns the object with the settings used for calls to lookupEntry.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datacatalog.LookupEntryRequest,com.google.cloud.datacatalog.Entry>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataCatalogStubSettings this]
    (-> this (.lookupEntrySettings))))

(defn list-tags-settings
  "Returns the object with the settings used for calls to listTags.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.datacatalog.ListTagsRequest,com.google.cloud.datacatalog.ListTagsResponse,com.google.cloud.datacatalog.v1beta1.DataCatalogClient$ListTagsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^DataCatalogStubSettings this]
    (-> this (.listTagsSettings))))

(defn test-iam-permissions-settings
  "Returns the object with the settings used for calls to testIamPermissions.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataCatalogStubSettings this]
    (-> this (.testIamPermissionsSettings))))

(defn update-entry-settings
  "Returns the object with the settings used for calls to updateEntry.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datacatalog.UpdateEntryRequest,com.google.cloud.datacatalog.Entry>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataCatalogStubSettings this]
    (-> this (.updateEntrySettings))))

(defn rename-tag-template-field-settings
  "Returns the object with the settings used for calls to renameTagTemplateField.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datacatalog.RenameTagTemplateFieldRequest,com.google.cloud.datacatalog.TagTemplateField>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataCatalogStubSettings this]
    (-> this (.renameTagTemplateFieldSettings))))

(defn update-tag-template-settings
  "Returns the object with the settings used for calls to updateTagTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datacatalog.UpdateTagTemplateRequest,com.google.cloud.datacatalog.TagTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataCatalogStubSettings this]
    (-> this (.updateTagTemplateSettings))))

(defn get-entry-settings
  "Returns the object with the settings used for calls to getEntry.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datacatalog.GetEntryRequest,com.google.cloud.datacatalog.Entry>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataCatalogStubSettings this]
    (-> this (.getEntrySettings))))

(defn set-iam-policy-settings
  "Returns the object with the settings used for calls to setIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataCatalogStubSettings this]
    (-> this (.setIamPolicySettings))))

(defn update-tag-settings
  "Returns the object with the settings used for calls to updateTag.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datacatalog.UpdateTagRequest,com.google.cloud.datacatalog.Tag>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataCatalogStubSettings this]
    (-> this (.updateTagSettings))))

(defn delete-tag-template-field-settings
  "Returns the object with the settings used for calls to deleteTagTemplateField.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datacatalog.DeleteTagTemplateFieldRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataCatalogStubSettings this]
    (-> this (.deleteTagTemplateFieldSettings))))

(defn delete-tag-template-settings
  "Returns the object with the settings used for calls to deleteTagTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datacatalog.DeleteTagTemplateRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataCatalogStubSettings this]
    (-> this (.deleteTagTemplateSettings))))

(defn delete-tag-settings
  "Returns the object with the settings used for calls to deleteTag.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datacatalog.DeleteTagRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataCatalogStubSettings this]
    (-> this (.deleteTagSettings))))

(defn get-tag-template-settings
  "Returns the object with the settings used for calls to getTagTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datacatalog.GetTagTemplateRequest,com.google.cloud.datacatalog.TagTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataCatalogStubSettings this]
    (-> this (.getTagTemplateSettings))))

(defn create-tag-template-field-settings
  "Returns the object with the settings used for calls to createTagTemplateField.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datacatalog.CreateTagTemplateFieldRequest,com.google.cloud.datacatalog.TagTemplateField>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataCatalogStubSettings this]
    (-> this (.createTagTemplateFieldSettings))))

(defn get-iam-policy-settings
  "Returns the object with the settings used for calls to getIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataCatalogStubSettings this]
    (-> this (.getIamPolicySettings))))

(defn create-tag-template-settings
  "Returns the object with the settings used for calls to createTagTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.datacatalog.CreateTagTemplateRequest,com.google.cloud.datacatalog.TagTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^DataCatalogStubSettings this]
    (-> this (.createTagTemplateSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.datacatalog.v1beta1.stub.DataCatalogStubSettings$Builder`"
  (^com.google.cloud.datacatalog.v1beta1.stub.DataCatalogStubSettings$Builder [^DataCatalogStubSettings this]
    (-> this (.toBuilder))))

