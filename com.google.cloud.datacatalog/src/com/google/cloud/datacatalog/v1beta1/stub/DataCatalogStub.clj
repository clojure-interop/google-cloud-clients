(ns com.google.cloud.datacatalog.v1beta1.stub.DataCatalogStub
  "Base stub class for Google Cloud Data Catalog API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datacatalog.v1beta1.stub DataCatalogStub]))

(defn ->data-catalog-stub
  "Constructor."
  (^DataCatalogStub []
    (new DataCatalogStub )))

(defn delete-tag-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.DeleteTagRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogStub this]
    (-> this (.deleteTagCallable))))

(defn get-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogStub this]
    (-> this (.getIamPolicyCallable))))

(defn search-catalog-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.SearchCatalogRequest,com.google.cloud.datacatalog.v1beta1.DataCatalogClient$SearchCatalogPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogStub this]
    (-> this (.searchCatalogPagedCallable))))

(defn lookup-entry-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.LookupEntryRequest,com.google.cloud.datacatalog.Entry>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogStub this]
    (-> this (.lookupEntryCallable))))

(defn create-tag-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.CreateTagTemplateRequest,com.google.cloud.datacatalog.TagTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogStub this]
    (-> this (.createTagTemplateCallable))))

(defn get-entry-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.GetEntryRequest,com.google.cloud.datacatalog.Entry>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogStub this]
    (-> this (.getEntryCallable))))

(defn update-tag-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.UpdateTagTemplateRequest,com.google.cloud.datacatalog.TagTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogStub this]
    (-> this (.updateTagTemplateCallable))))

(defn get-tag-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.GetTagTemplateRequest,com.google.cloud.datacatalog.TagTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogStub this]
    (-> this (.getTagTemplateCallable))))

(defn update-entry-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.UpdateEntryRequest,com.google.cloud.datacatalog.Entry>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogStub this]
    (-> this (.updateEntryCallable))))

(defn set-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogStub this]
    (-> this (.setIamPolicyCallable))))

(defn search-catalog-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.SearchCatalogRequest,com.google.cloud.datacatalog.SearchCatalogResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogStub this]
    (-> this (.searchCatalogCallable))))

(defn close
  ""
  ([^DataCatalogStub this]
    (-> this (.close))))

(defn test-iam-permissions-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogStub this]
    (-> this (.testIamPermissionsCallable))))

(defn list-tags-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.ListTagsRequest,com.google.cloud.datacatalog.v1beta1.DataCatalogClient$ListTagsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogStub this]
    (-> this (.listTagsPagedCallable))))

(defn create-tag-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.CreateTagRequest,com.google.cloud.datacatalog.Tag>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogStub this]
    (-> this (.createTagCallable))))

(defn list-tags-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.ListTagsRequest,com.google.cloud.datacatalog.ListTagsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogStub this]
    (-> this (.listTagsCallable))))

(defn delete-tag-template-field-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.DeleteTagTemplateFieldRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogStub this]
    (-> this (.deleteTagTemplateFieldCallable))))

(defn update-tag-template-field-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.UpdateTagTemplateFieldRequest,com.google.cloud.datacatalog.TagTemplateField>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogStub this]
    (-> this (.updateTagTemplateFieldCallable))))

(defn delete-tag-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.DeleteTagTemplateRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogStub this]
    (-> this (.deleteTagTemplateCallable))))

(defn update-tag-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.UpdateTagRequest,com.google.cloud.datacatalog.Tag>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogStub this]
    (-> this (.updateTagCallable))))

(defn rename-tag-template-field-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.RenameTagTemplateFieldRequest,com.google.cloud.datacatalog.TagTemplateField>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogStub this]
    (-> this (.renameTagTemplateFieldCallable))))

(defn create-tag-template-field-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.CreateTagTemplateFieldRequest,com.google.cloud.datacatalog.TagTemplateField>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataCatalogStub this]
    (-> this (.createTagTemplateFieldCallable))))

