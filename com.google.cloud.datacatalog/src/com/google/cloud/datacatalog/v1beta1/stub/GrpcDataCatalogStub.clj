(ns com.google.cloud.datacatalog.v1beta1.stub.GrpcDataCatalogStub
  "gRPC stub implementation for Google Cloud Data Catalog API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datacatalog.v1beta1.stub GrpcDataCatalogStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.datacatalog.v1beta1.stub.GrpcDataCatalogStub`

  throws: java.io.IOException"
  (^com.google.cloud.datacatalog.v1beta1.stub.GrpcDataCatalogStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcDataCatalogStub/create client-context callable-factory))
  (^com.google.cloud.datacatalog.v1beta1.stub.GrpcDataCatalogStub [^com.google.cloud.datacatalog.v1beta1.stub.DataCatalogStubSettings settings]
    (GrpcDataCatalogStub/create settings)))

(defn delete-tag-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.DeleteTagRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataCatalogStub this]
    (-> this (.deleteTagCallable))))

(defn get-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataCatalogStub this]
    (-> this (.getIamPolicyCallable))))

(defn search-catalog-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.SearchCatalogRequest,com.google.cloud.datacatalog.v1beta1.DataCatalogClient$SearchCatalogPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataCatalogStub this]
    (-> this (.searchCatalogPagedCallable))))

(defn lookup-entry-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.LookupEntryRequest,com.google.cloud.datacatalog.Entry>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataCatalogStub this]
    (-> this (.lookupEntryCallable))))

(defn create-tag-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.CreateTagTemplateRequest,com.google.cloud.datacatalog.TagTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataCatalogStub this]
    (-> this (.createTagTemplateCallable))))

(defn get-entry-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.GetEntryRequest,com.google.cloud.datacatalog.Entry>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataCatalogStub this]
    (-> this (.getEntryCallable))))

(defn update-tag-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.UpdateTagTemplateRequest,com.google.cloud.datacatalog.TagTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataCatalogStub this]
    (-> this (.updateTagTemplateCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcDataCatalogStub this]
    (-> this (.isShutdown))))

(defn get-tag-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.GetTagTemplateRequest,com.google.cloud.datacatalog.TagTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataCatalogStub this]
    (-> this (.getTagTemplateCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcDataCatalogStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcDataCatalogStub this]
    (-> this (.shutdown))))

(defn update-entry-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.UpdateEntryRequest,com.google.cloud.datacatalog.Entry>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataCatalogStub this]
    (-> this (.updateEntryCallable))))

(defn set-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataCatalogStub this]
    (-> this (.setIamPolicyCallable))))

(defn search-catalog-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.SearchCatalogRequest,com.google.cloud.datacatalog.SearchCatalogResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataCatalogStub this]
    (-> this (.searchCatalogCallable))))

(defn close
  ""
  ([^GrpcDataCatalogStub this]
    (-> this (.close))))

(defn test-iam-permissions-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataCatalogStub this]
    (-> this (.testIamPermissionsCallable))))

(defn list-tags-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.ListTagsRequest,com.google.cloud.datacatalog.v1beta1.DataCatalogClient$ListTagsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataCatalogStub this]
    (-> this (.listTagsPagedCallable))))

(defn create-tag-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.CreateTagRequest,com.google.cloud.datacatalog.Tag>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataCatalogStub this]
    (-> this (.createTagCallable))))

(defn list-tags-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.ListTagsRequest,com.google.cloud.datacatalog.ListTagsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataCatalogStub this]
    (-> this (.listTagsCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcDataCatalogStub this]
    (-> this (.isTerminated))))

(defn delete-tag-template-field-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.DeleteTagTemplateFieldRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataCatalogStub this]
    (-> this (.deleteTagTemplateFieldCallable))))

(defn update-tag-template-field-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.UpdateTagTemplateFieldRequest,com.google.cloud.datacatalog.TagTemplateField>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataCatalogStub this]
    (-> this (.updateTagTemplateFieldCallable))))

(defn delete-tag-template-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.DeleteTagTemplateRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataCatalogStub this]
    (-> this (.deleteTagTemplateCallable))))

(defn update-tag-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.UpdateTagRequest,com.google.cloud.datacatalog.Tag>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataCatalogStub this]
    (-> this (.updateTagCallable))))

(defn rename-tag-template-field-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.RenameTagTemplateFieldRequest,com.google.cloud.datacatalog.TagTemplateField>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataCatalogStub this]
    (-> this (.renameTagTemplateFieldCallable))))

(defn shutdown-now
  ""
  ([^GrpcDataCatalogStub this]
    (-> this (.shutdownNow))))

(defn create-tag-template-field-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.datacatalog.CreateTagTemplateFieldRequest,com.google.cloud.datacatalog.TagTemplateField>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataCatalogStub this]
    (-> this (.createTagTemplateFieldCallable))))

