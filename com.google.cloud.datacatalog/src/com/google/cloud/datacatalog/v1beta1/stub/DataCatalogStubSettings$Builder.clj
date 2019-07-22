(ns com.google.cloud.datacatalog.v1beta1.stub.DataCatalogStubSettings$Builder
  "Builder for DataCatalogStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datacatalog.v1beta1.stub DataCatalogStubSettings$Builder]))

(defn search-catalog-settings
  "Returns the builder for the settings used for calls to searchCatalog.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.datacatalog.SearchCatalogRequest,com.google.cloud.datacatalog.SearchCatalogResponse,com.google.cloud.datacatalog.v1beta1.DataCatalogClient$SearchCatalogPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^DataCatalogStubSettings$Builder this]
    (-> this (.searchCatalogSettings))))

(defn create-tag-settings
  "Returns the builder for the settings used for calls to createTag.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datacatalog.CreateTagRequest,com.google.cloud.datacatalog.Tag>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataCatalogStubSettings$Builder this]
    (-> this (.createTagSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.datacatalog.v1beta1.stub.DataCatalogStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.datacatalog.v1beta1.stub.DataCatalogStubSettings$Builder [^DataCatalogStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn update-tag-template-field-settings
  "Returns the builder for the settings used for calls to updateTagTemplateField.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datacatalog.UpdateTagTemplateFieldRequest,com.google.cloud.datacatalog.TagTemplateField>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataCatalogStubSettings$Builder this]
    (-> this (.updateTagTemplateFieldSettings))))

(defn lookup-entry-settings
  "Returns the builder for the settings used for calls to lookupEntry.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datacatalog.LookupEntryRequest,com.google.cloud.datacatalog.Entry>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataCatalogStubSettings$Builder this]
    (-> this (.lookupEntrySettings))))

(defn list-tags-settings
  "Returns the builder for the settings used for calls to listTags.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.datacatalog.ListTagsRequest,com.google.cloud.datacatalog.ListTagsResponse,com.google.cloud.datacatalog.v1beta1.DataCatalogClient$ListTagsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^DataCatalogStubSettings$Builder this]
    (-> this (.listTagsSettings))))

(defn test-iam-permissions-settings
  "Returns the builder for the settings used for calls to testIamPermissions.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataCatalogStubSettings$Builder this]
    (-> this (.testIamPermissionsSettings))))

(defn update-entry-settings
  "Returns the builder for the settings used for calls to updateEntry.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datacatalog.UpdateEntryRequest,com.google.cloud.datacatalog.Entry>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataCatalogStubSettings$Builder this]
    (-> this (.updateEntrySettings))))

(defn rename-tag-template-field-settings
  "Returns the builder for the settings used for calls to renameTagTemplateField.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datacatalog.RenameTagTemplateFieldRequest,com.google.cloud.datacatalog.TagTemplateField>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataCatalogStubSettings$Builder this]
    (-> this (.renameTagTemplateFieldSettings))))

(defn update-tag-template-settings
  "Returns the builder for the settings used for calls to updateTagTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datacatalog.UpdateTagTemplateRequest,com.google.cloud.datacatalog.TagTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataCatalogStubSettings$Builder this]
    (-> this (.updateTagTemplateSettings))))

(defn get-entry-settings
  "Returns the builder for the settings used for calls to getEntry.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datacatalog.GetEntryRequest,com.google.cloud.datacatalog.Entry>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataCatalogStubSettings$Builder this]
    (-> this (.getEntrySettings))))

(defn set-iam-policy-settings
  "Returns the builder for the settings used for calls to setIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataCatalogStubSettings$Builder this]
    (-> this (.setIamPolicySettings))))

(defn update-tag-settings
  "Returns the builder for the settings used for calls to updateTag.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datacatalog.UpdateTagRequest,com.google.cloud.datacatalog.Tag>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataCatalogStubSettings$Builder this]
    (-> this (.updateTagSettings))))

(defn build
  "returns: `com.google.cloud.datacatalog.v1beta1.stub.DataCatalogStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.datacatalog.v1beta1.stub.DataCatalogStubSettings [^DataCatalogStubSettings$Builder this]
    (-> this (.build))))

(defn delete-tag-template-field-settings
  "Returns the builder for the settings used for calls to deleteTagTemplateField.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datacatalog.DeleteTagTemplateFieldRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataCatalogStubSettings$Builder this]
    (-> this (.deleteTagTemplateFieldSettings))))

(defn delete-tag-template-settings
  "Returns the builder for the settings used for calls to deleteTagTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datacatalog.DeleteTagTemplateRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataCatalogStubSettings$Builder this]
    (-> this (.deleteTagTemplateSettings))))

(defn delete-tag-settings
  "Returns the builder for the settings used for calls to deleteTag.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datacatalog.DeleteTagRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataCatalogStubSettings$Builder this]
    (-> this (.deleteTagSettings))))

(defn get-tag-template-settings
  "Returns the builder for the settings used for calls to getTagTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datacatalog.GetTagTemplateRequest,com.google.cloud.datacatalog.TagTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataCatalogStubSettings$Builder this]
    (-> this (.getTagTemplateSettings))))

(defn create-tag-template-field-settings
  "Returns the builder for the settings used for calls to createTagTemplateField.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datacatalog.CreateTagTemplateFieldRequest,com.google.cloud.datacatalog.TagTemplateField>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataCatalogStubSettings$Builder this]
    (-> this (.createTagTemplateFieldSettings))))

(defn get-iam-policy-settings
  "Returns the builder for the settings used for calls to getIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataCatalogStubSettings$Builder this]
    (-> this (.getIamPolicySettings))))

(defn create-tag-template-settings
  "Returns the builder for the settings used for calls to createTagTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.datacatalog.CreateTagTemplateRequest,com.google.cloud.datacatalog.TagTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^DataCatalogStubSettings$Builder this]
    (-> this (.createTagTemplateSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^DataCatalogStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

