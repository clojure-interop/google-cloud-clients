(ns com.google.cloud.vision.v1p3beta1.stub.ProductSearchStubSettings
  "Settings class to configure an instance of ProductSearchStub.

  The default instance has everything set to sensible defaults:


    The default service address (vision.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of createProductSet to 30 seconds:



  ProductSearchStubSettings.Builder productSearchSettingsBuilder =
      ProductSearchStubSettings.newBuilder();
  productSearchSettingsBuilder.createProductSetSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  ProductSearchStubSettings productSearchSettings = productSearchSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.vision.v1p3beta1.stub ProductSearchStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (ProductSearchStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (ProductSearchStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (ProductSearchStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (ProductSearchStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (ProductSearchStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (ProductSearchStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (ProductSearchStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.vision.v1p3beta1.stub.ProductSearchStubSettings$Builder`"
  (^com.google.cloud.vision.v1p3beta1.stub.ProductSearchStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (ProductSearchStubSettings/newBuilder client-context))
  (^com.google.cloud.vision.v1p3beta1.stub.ProductSearchStubSettings$Builder []
    (ProductSearchStubSettings/newBuilder )))

(defn delete-reference-image-settings
  "Returns the object with the settings used for calls to deleteReferenceImage.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.vision.v1p3beta1.DeleteReferenceImageRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ProductSearchStubSettings this]
    (-> this (.deleteReferenceImageSettings))))

(defn import-product-sets-settings
  "Returns the object with the settings used for calls to importProductSets.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ProductSearchStubSettings this]
    (-> this (.importProductSetsSettings))))

(defn get-product-set-settings
  "Returns the object with the settings used for calls to getProductSet.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.vision.v1p3beta1.GetProductSetRequest,com.google.cloud.vision.v1p3beta1.ProductSet>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ProductSearchStubSettings this]
    (-> this (.getProductSetSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.vision.v1p3beta1.stub.ProductSearchStub`

  throws: java.io.IOException"
  ([^ProductSearchStubSettings this]
    (-> this (.createStub))))

(defn add-product-to-product-set-settings
  "Returns the object with the settings used for calls to addProductToProductSet.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.vision.v1p3beta1.AddProductToProductSetRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ProductSearchStubSettings this]
    (-> this (.addProductToProductSetSettings))))

(defn remove-product-from-product-set-settings
  "Returns the object with the settings used for calls to removeProductFromProductSet.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.vision.v1p3beta1.RemoveProductFromProductSetRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ProductSearchStubSettings this]
    (-> this (.removeProductFromProductSetSettings))))

(defn list-product-sets-settings
  "Returns the object with the settings used for calls to listProductSets.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.vision.v1p3beta1.ListProductSetsRequest,com.google.cloud.vision.v1p3beta1.ListProductSetsResponse,com.google.cloud.vision.v1p3beta1.ProductSearchClient$ListProductSetsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^ProductSearchStubSettings this]
    (-> this (.listProductSetsSettings))))

(defn get-product-settings
  "Returns the object with the settings used for calls to getProduct.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.vision.v1p3beta1.GetProductRequest,com.google.cloud.vision.v1p3beta1.Product>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ProductSearchStubSettings this]
    (-> this (.getProductSettings))))

(defn delete-product-settings
  "Returns the object with the settings used for calls to deleteProduct.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.vision.v1p3beta1.DeleteProductRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ProductSearchStubSettings this]
    (-> this (.deleteProductSettings))))

(defn create-product-settings
  "Returns the object with the settings used for calls to createProduct.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.vision.v1p3beta1.CreateProductRequest,com.google.cloud.vision.v1p3beta1.Product>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ProductSearchStubSettings this]
    (-> this (.createProductSettings))))

(defn list-products-settings
  "Returns the object with the settings used for calls to listProducts.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.vision.v1p3beta1.ListProductsRequest,com.google.cloud.vision.v1p3beta1.ListProductsResponse,com.google.cloud.vision.v1p3beta1.ProductSearchClient$ListProductsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^ProductSearchStubSettings this]
    (-> this (.listProductsSettings))))

(defn get-reference-image-settings
  "Returns the object with the settings used for calls to getReferenceImage.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.vision.v1p3beta1.GetReferenceImageRequest,com.google.cloud.vision.v1p3beta1.ReferenceImage>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ProductSearchStubSettings this]
    (-> this (.getReferenceImageSettings))))

(defn create-product-set-settings
  "Returns the object with the settings used for calls to createProductSet.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.vision.v1p3beta1.CreateProductSetRequest,com.google.cloud.vision.v1p3beta1.ProductSet>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ProductSearchStubSettings this]
    (-> this (.createProductSetSettings))))

(defn list-reference-images-settings
  "Returns the object with the settings used for calls to listReferenceImages.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.vision.v1p3beta1.ListReferenceImagesRequest,com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse,com.google.cloud.vision.v1p3beta1.ProductSearchClient$ListReferenceImagesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^ProductSearchStubSettings this]
    (-> this (.listReferenceImagesSettings))))

(defn update-product-settings
  "Returns the object with the settings used for calls to updateProduct.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.vision.v1p3beta1.UpdateProductRequest,com.google.cloud.vision.v1p3beta1.Product>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ProductSearchStubSettings this]
    (-> this (.updateProductSettings))))

(defn import-product-sets-operation-settings
  "Returns the object with the settings used for calls to importProductSets.

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest,com.google.cloud.vision.v1p3beta1.ImportProductSetsResponse,com.google.cloud.vision.v1p3beta1.BatchOperationMetadata>`"
  ([^ProductSearchStubSettings this]
    (-> this (.importProductSetsOperationSettings))))

(defn list-products-in-product-set-settings
  "Returns the object with the settings used for calls to listProductsInProductSet.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.vision.v1p3beta1.ListProductsInProductSetRequest,com.google.cloud.vision.v1p3beta1.ListProductsInProductSetResponse,com.google.cloud.vision.v1p3beta1.ProductSearchClient$ListProductsInProductSetPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^ProductSearchStubSettings this]
    (-> this (.listProductsInProductSetSettings))))

(defn update-product-set-settings
  "Returns the object with the settings used for calls to updateProductSet.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest,com.google.cloud.vision.v1p3beta1.ProductSet>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ProductSearchStubSettings this]
    (-> this (.updateProductSetSettings))))

(defn create-reference-image-settings
  "Returns the object with the settings used for calls to createReferenceImage.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.vision.v1p3beta1.CreateReferenceImageRequest,com.google.cloud.vision.v1p3beta1.ReferenceImage>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ProductSearchStubSettings this]
    (-> this (.createReferenceImageSettings))))

(defn delete-product-set-settings
  "Returns the object with the settings used for calls to deleteProductSet.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.vision.v1p3beta1.DeleteProductSetRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ProductSearchStubSettings this]
    (-> this (.deleteProductSetSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.vision.v1p3beta1.stub.ProductSearchStubSettings$Builder`"
  (^com.google.cloud.vision.v1p3beta1.stub.ProductSearchStubSettings$Builder [^ProductSearchStubSettings this]
    (-> this (.toBuilder))))

