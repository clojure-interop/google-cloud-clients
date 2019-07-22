(ns com.google.cloud.vision.v1.stub.GrpcProductSearchStub
  "gRPC stub implementation for Cloud Vision API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.vision.v1.stub GrpcProductSearchStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.vision.v1.stub.GrpcProductSearchStub`

  throws: java.io.IOException"
  (^com.google.cloud.vision.v1.stub.GrpcProductSearchStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcProductSearchStub/create client-context callable-factory))
  (^com.google.cloud.vision.v1.stub.GrpcProductSearchStub [^com.google.cloud.vision.v1.stub.ProductSearchStubSettings settings]
    (GrpcProductSearchStub/create settings)))

(defn create-product-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1.CreateProductRequest,com.google.cloud.vision.v1.Product>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcProductSearchStub this]
    (-> this (.createProductCallable))))

(defn import-product-sets-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1.ImportProductSetsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcProductSearchStub this]
    (-> this (.importProductSetsCallable))))

(defn get-product-set-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1.GetProductSetRequest,com.google.cloud.vision.v1.ProductSet>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcProductSearchStub this]
    (-> this (.getProductSetCallable))))

(defn list-products-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1.ListProductsRequest,com.google.cloud.vision.v1.ListProductsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcProductSearchStub this]
    (-> this (.listProductsCallable))))

(defn get-operations-stub
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.longrunning.stub.GrpcOperationsStub`"
  ([^GrpcProductSearchStub this]
    (-> this (.getOperationsStub))))

(defn list-product-sets-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1.ListProductSetsRequest,com.google.cloud.vision.v1.ListProductSetsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcProductSearchStub this]
    (-> this (.listProductSetsCallable))))

(defn import-product-sets-operation-callable
  "returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallable<com.google.cloud.vision.v1.ImportProductSetsRequest,com.google.cloud.vision.v1.ImportProductSetsResponse,com.google.cloud.vision.v1.BatchOperationMetadata>`"
  ([^GrpcProductSearchStub this]
    (-> this (.importProductSetsOperationCallable))))

(defn delete-reference-image-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1.DeleteReferenceImageRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcProductSearchStub this]
    (-> this (.deleteReferenceImageCallable))))

(defn create-reference-image-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1.CreateReferenceImageRequest,com.google.cloud.vision.v1.ReferenceImage>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcProductSearchStub this]
    (-> this (.createReferenceImageCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcProductSearchStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcProductSearchStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn create-product-set-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1.CreateProductSetRequest,com.google.cloud.vision.v1.ProductSet>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcProductSearchStub this]
    (-> this (.createProductSetCallable))))

(defn shutdown
  ""
  ([^GrpcProductSearchStub this]
    (-> this (.shutdown))))

(defn add-product-to-product-set-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1.AddProductToProductSetRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcProductSearchStub this]
    (-> this (.addProductToProductSetCallable))))

(defn get-product-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1.GetProductRequest,com.google.cloud.vision.v1.Product>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcProductSearchStub this]
    (-> this (.getProductCallable))))

(defn list-products-in-product-set-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1.ListProductsInProductSetRequest,com.google.cloud.vision.v1.ProductSearchClient$ListProductsInProductSetPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcProductSearchStub this]
    (-> this (.listProductsInProductSetPagedCallable))))

(defn list-products-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1.ListProductsRequest,com.google.cloud.vision.v1.ProductSearchClient$ListProductsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcProductSearchStub this]
    (-> this (.listProductsPagedCallable))))

(defn remove-product-from-product-set-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1.RemoveProductFromProductSetRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcProductSearchStub this]
    (-> this (.removeProductFromProductSetCallable))))

(defn list-reference-images-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1.ListReferenceImagesRequest,com.google.cloud.vision.v1.ListReferenceImagesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcProductSearchStub this]
    (-> this (.listReferenceImagesCallable))))

(defn close
  ""
  ([^GrpcProductSearchStub this]
    (-> this (.close))))

(defn list-products-in-product-set-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1.ListProductsInProductSetRequest,com.google.cloud.vision.v1.ListProductsInProductSetResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcProductSearchStub this]
    (-> this (.listProductsInProductSetCallable))))

(defn delete-product-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1.DeleteProductRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcProductSearchStub this]
    (-> this (.deleteProductCallable))))

(defn update-product-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1.UpdateProductRequest,com.google.cloud.vision.v1.Product>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcProductSearchStub this]
    (-> this (.updateProductCallable))))

(defn list-product-sets-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1.ListProductSetsRequest,com.google.cloud.vision.v1.ProductSearchClient$ListProductSetsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcProductSearchStub this]
    (-> this (.listProductSetsPagedCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcProductSearchStub this]
    (-> this (.isTerminated))))

(defn update-product-set-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1.UpdateProductSetRequest,com.google.cloud.vision.v1.ProductSet>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcProductSearchStub this]
    (-> this (.updateProductSetCallable))))

(defn get-reference-image-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1.GetReferenceImageRequest,com.google.cloud.vision.v1.ReferenceImage>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcProductSearchStub this]
    (-> this (.getReferenceImageCallable))))

(defn list-reference-images-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1.ListReferenceImagesRequest,com.google.cloud.vision.v1.ProductSearchClient$ListReferenceImagesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcProductSearchStub this]
    (-> this (.listReferenceImagesPagedCallable))))

(defn shutdown-now
  ""
  ([^GrpcProductSearchStub this]
    (-> this (.shutdownNow))))

(defn delete-product-set-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1.DeleteProductSetRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcProductSearchStub this]
    (-> this (.deleteProductSetCallable))))

