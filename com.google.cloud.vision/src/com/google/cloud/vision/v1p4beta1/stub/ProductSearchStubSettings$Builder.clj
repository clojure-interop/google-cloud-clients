(ns com.google.cloud.vision.v1p4beta1.stub.ProductSearchStubSettings$Builder
  "Builder for ProductSearchStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.vision.v1p4beta1.stub ProductSearchStubSettings$Builder]))

(defn delete-reference-image-settings
  "Returns the builder for the settings used for calls to deleteReferenceImage.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.vision.v1p4beta1.DeleteReferenceImageRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ProductSearchStubSettings$Builder this]
    (-> this (.deleteReferenceImageSettings))))

(defn import-product-sets-settings
  "Returns the builder for the settings used for calls to importProductSets.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.vision.v1p4beta1.ImportProductSetsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ProductSearchStubSettings$Builder this]
    (-> this (.importProductSetsSettings))))

(defn get-product-set-settings
  "Returns the builder for the settings used for calls to getProductSet.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.vision.v1p4beta1.GetProductSetRequest,com.google.cloud.vision.v1p4beta1.ProductSet>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ProductSearchStubSettings$Builder this]
    (-> this (.getProductSetSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.vision.v1p4beta1.stub.ProductSearchStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.vision.v1p4beta1.stub.ProductSearchStubSettings$Builder [^ProductSearchStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn add-product-to-product-set-settings
  "Returns the builder for the settings used for calls to addProductToProductSet.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.vision.v1p4beta1.AddProductToProductSetRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ProductSearchStubSettings$Builder this]
    (-> this (.addProductToProductSetSettings))))

(defn remove-product-from-product-set-settings
  "Returns the builder for the settings used for calls to removeProductFromProductSet.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.vision.v1p4beta1.RemoveProductFromProductSetRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ProductSearchStubSettings$Builder this]
    (-> this (.removeProductFromProductSetSettings))))

(defn list-product-sets-settings
  "Returns the builder for the settings used for calls to listProductSets.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.vision.v1p4beta1.ListProductSetsRequest,com.google.cloud.vision.v1p4beta1.ListProductSetsResponse,com.google.cloud.vision.v1p4beta1.ProductSearchClient$ListProductSetsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^ProductSearchStubSettings$Builder this]
    (-> this (.listProductSetsSettings))))

(defn get-product-settings
  "Returns the builder for the settings used for calls to getProduct.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.vision.v1p4beta1.GetProductRequest,com.google.cloud.vision.v1p4beta1.Product>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ProductSearchStubSettings$Builder this]
    (-> this (.getProductSettings))))

(defn delete-product-settings
  "Returns the builder for the settings used for calls to deleteProduct.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.vision.v1p4beta1.DeleteProductRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ProductSearchStubSettings$Builder this]
    (-> this (.deleteProductSettings))))

(defn build
  "returns: `com.google.cloud.vision.v1p4beta1.stub.ProductSearchStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.vision.v1p4beta1.stub.ProductSearchStubSettings [^ProductSearchStubSettings$Builder this]
    (-> this (.build))))

(defn create-product-settings
  "Returns the builder for the settings used for calls to createProduct.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.vision.v1p4beta1.CreateProductRequest,com.google.cloud.vision.v1p4beta1.Product>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ProductSearchStubSettings$Builder this]
    (-> this (.createProductSettings))))

(defn list-products-settings
  "Returns the builder for the settings used for calls to listProducts.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.vision.v1p4beta1.ListProductsRequest,com.google.cloud.vision.v1p4beta1.ListProductsResponse,com.google.cloud.vision.v1p4beta1.ProductSearchClient$ListProductsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^ProductSearchStubSettings$Builder this]
    (-> this (.listProductsSettings))))

(defn get-reference-image-settings
  "Returns the builder for the settings used for calls to getReferenceImage.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.vision.v1p4beta1.GetReferenceImageRequest,com.google.cloud.vision.v1p4beta1.ReferenceImage>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ProductSearchStubSettings$Builder this]
    (-> this (.getReferenceImageSettings))))

(defn create-product-set-settings
  "Returns the builder for the settings used for calls to createProductSet.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.vision.v1p4beta1.CreateProductSetRequest,com.google.cloud.vision.v1p4beta1.ProductSet>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ProductSearchStubSettings$Builder this]
    (-> this (.createProductSetSettings))))

(defn list-reference-images-settings
  "Returns the builder for the settings used for calls to listReferenceImages.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.vision.v1p4beta1.ListReferenceImagesRequest,com.google.cloud.vision.v1p4beta1.ListReferenceImagesResponse,com.google.cloud.vision.v1p4beta1.ProductSearchClient$ListReferenceImagesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^ProductSearchStubSettings$Builder this]
    (-> this (.listReferenceImagesSettings))))

(defn update-product-settings
  "Returns the builder for the settings used for calls to updateProduct.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.vision.v1p4beta1.UpdateProductRequest,com.google.cloud.vision.v1p4beta1.Product>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ProductSearchStubSettings$Builder this]
    (-> this (.updateProductSettings))))

(defn import-product-sets-operation-settings
  "Returns the builder for the settings used for calls to importProductSets.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings.Builder<com.google.cloud.vision.v1p4beta1.ImportProductSetsRequest,com.google.cloud.vision.v1p4beta1.ImportProductSetsResponse,com.google.cloud.vision.v1p4beta1.BatchOperationMetadata>`"
  ([^ProductSearchStubSettings$Builder this]
    (-> this (.importProductSetsOperationSettings))))

(defn list-products-in-product-set-settings
  "Returns the builder for the settings used for calls to listProductsInProductSet.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.vision.v1p4beta1.ListProductsInProductSetRequest,com.google.cloud.vision.v1p4beta1.ListProductsInProductSetResponse,com.google.cloud.vision.v1p4beta1.ProductSearchClient$ListProductsInProductSetPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^ProductSearchStubSettings$Builder this]
    (-> this (.listProductsInProductSetSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^ProductSearchStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn update-product-set-settings
  "Returns the builder for the settings used for calls to updateProductSet.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.vision.v1p4beta1.UpdateProductSetRequest,com.google.cloud.vision.v1p4beta1.ProductSet>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ProductSearchStubSettings$Builder this]
    (-> this (.updateProductSetSettings))))

(defn create-reference-image-settings
  "Returns the builder for the settings used for calls to createReferenceImage.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.vision.v1p4beta1.CreateReferenceImageRequest,com.google.cloud.vision.v1p4beta1.ReferenceImage>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ProductSearchStubSettings$Builder this]
    (-> this (.createReferenceImageSettings))))

(defn delete-product-set-settings
  "Returns the builder for the settings used for calls to deleteProductSet.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.vision.v1p4beta1.DeleteProductSetRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^ProductSearchStubSettings$Builder this]
    (-> this (.deleteProductSetSettings))))

