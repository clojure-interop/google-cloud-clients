(ns com.google.cloud.vision.v1p3beta1.ProductSearchClient
  "Service Description: Manages Products and ProductSets of reference images for use in product
  search. It uses the following resource model:

  - The API has a collection of [ProductSet][google.cloud.vision.v1p3beta1.ProductSet]
  resources, named `projects/*/locations/*/productSets/*`, which acts as a way to put
  different products into groups to limit identification.

  In parallel,

  - The API has a collection of [Product][google.cloud.vision.v1p3beta1.Product] resources,
  named `projects/*/locations/*/products/*`

  - Each [Product][google.cloud.vision.v1p3beta1.Product] has a collection of
  [ReferenceImage][google.cloud.vision.v1p3beta1.ReferenceImage] resources, named
  `projects/*/locations/*/products/*/referenceImages/*`

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
    LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
    ProductSet productSet = ProductSet.newBuilder().build();
    String productSetId = \"\";
    ProductSet response = productSearchClient.createProductSet(parent, productSet, productSetId);
  }

  Note: close() needs to be called on the productSearchClient object to clean up resources such
  as threads. In the example above, try-with-resources is used, which automatically calls close().

  The surface of this class includes several types of Java methods for each of the API's
  methods:


    A \"flattened\" method. With this type of method, the fields of the request type have been
        converted into function parameters. It may be the case that not all fields are available as
        parameters, and not every API method will have a flattened method entry point.
    A \"request object\" method. This type of method only takes one parameter, a request object,
        which must be constructed before the call. Not every API method will have a request object
        method.
    A \"callable\" method. This type of method takes no parameters and returns an immutable API
        callable object, which can be used to initiate calls to the service.


  See the individual methods for example code.

  Many parameters require resource names to be formatted in a particular way. To assist with
  these names, this class includes a format method for each type of name, and additionally a parse
  method to extract the individual identifiers contained within names that are returned.

  This class can be customized by passing in a custom instance of ProductSearchSettings to
  create(). For example:

  To customize credentials:



  ProductSearchSettings productSearchSettings =
      ProductSearchSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  ProductSearchClient productSearchClient =
      ProductSearchClient.create(productSearchSettings);

  To customize the endpoint:



  ProductSearchSettings productSearchSettings =
      ProductSearchSettings.newBuilder().setEndpoint(myEndpoint).build();
  ProductSearchClient productSearchClient =
      ProductSearchClient.create(productSearchSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.vision.v1p3beta1 ProductSearchClient]))

(defn *create
  "Constructs an instance of ProductSearchClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.vision.v1p3beta1.ProductSearchSettings`

  returns: `com.google.cloud.vision.v1p3beta1.ProductSearchClient`

  throws: java.io.IOException"
  (^com.google.cloud.vision.v1p3beta1.ProductSearchClient [^com.google.cloud.vision.v1p3beta1.ProductSearchSettings settings]
    (ProductSearchClient/create settings))
  (^com.google.cloud.vision.v1p3beta1.ProductSearchClient []
    (ProductSearchClient/create )))

(defn get-reference-image
  "Gets information associated with a ReferenceImage.

   Possible errors:

   * Returns NOT_FOUND if the specified image does not exist.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     ReferenceImageName name = ReferenceImageName.of(\"[PROJECT]\", \"[LOCATION]\", \"[PRODUCT]\", \"[REFERENCE_IMAGE]\");
     ReferenceImage response = productSearchClient.getReferenceImage(name);
   }

  name - The resource name of the ReferenceImage to get. Format is: `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID/referenceImages/IMAGE_ID`. - `com.google.cloud.vision.v1p3beta1.ReferenceImageName`

  returns: `com.google.cloud.vision.v1p3beta1.ReferenceImage`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.vision.v1p3beta1.ReferenceImage [^ProductSearchClient this ^com.google.cloud.vision.v1p3beta1.ReferenceImageName name]
    (-> this (.getReferenceImage name))))

(defn create-product-callable
  "Creates and returns a new product resource.

   Possible errors:

   * Returns INVALID_ARGUMENT if display_name is missing or longer than 4096 characters.
   * Returns INVALID_ARGUMENT if description is longer than 4096 characters. * Returns
   INVALID_ARGUMENT if product_category is missing or invalid.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     Product product = Product.newBuilder().build();
     String productId = \"\";
     CreateProductRequest request = CreateProductRequest.newBuilder()
       .setParent(parent.toString())
       .setProduct(product)
       .setProductId(productId)
       .build();
     ApiFuture<Product> future = productSearchClient.createProductCallable().futureCall(request);
     // Do something
     Product response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1p3beta1.CreateProductRequest,com.google.cloud.vision.v1p3beta1.Product>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProductSearchClient this]
    (-> this (.createProductCallable))))

(defn import-product-sets-callable
  "Asynchronous API that imports a list of reference images to specified product sets based on a
   list of image information.

   The [google.longrunning.Operation][google.longrunning.Operation] API can be used to keep
   track of the progress and results of the request. `Operation.metadata` contains
   `BatchOperationMetadata`. (progress) `Operation.response` contains `ImportProductSetsResponse`.
   (results)

   The input source of this method is a csv file on Google Cloud Storage. For the format of the
   csv file please see
   [ImportProductSetsGcsSource.csv_file_uri][google.cloud.vision.v1p3beta1.ImportProductSetsGcsSource.csv_file_uri].

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     ImportProductSetsInputConfig inputConfig = ImportProductSetsInputConfig.newBuilder().build();
     ImportProductSetsRequest request = ImportProductSetsRequest.newBuilder()
       .setParent(parent.toString())
       .setInputConfig(inputConfig)
       .build();
     ApiFuture<Operation> future = productSearchClient.importProductSetsCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProductSearchClient this]
    (-> this (.importProductSetsCallable))))

(defn get-product-set-callable
  "Gets information associated with a ProductSet.

   Possible errors:

   * Returns NOT_FOUND if the ProductSet does not exist.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     ProductSetName name = ProductSetName.of(\"[PROJECT]\", \"[LOCATION]\", \"[PRODUCT_SET]\");
     GetProductSetRequest request = GetProductSetRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<ProductSet> future = productSearchClient.getProductSetCallable().futureCall(request);
     // Do something
     ProductSet response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1p3beta1.GetProductSetRequest,com.google.cloud.vision.v1p3beta1.ProductSet>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProductSearchClient this]
    (-> this (.getProductSetCallable))))

(defn remove-product-from-product-set
  "Removes a Product from the specified ProductSet.

   Possible errors:

   * Returns NOT_FOUND If the Product is not found under the ProductSet.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     ProductSetName name = ProductSetName.of(\"[PROJECT]\", \"[LOCATION]\", \"[PRODUCT_SET]\");
     String product = \"\";
     productSearchClient.removeProductFromProductSet(name, product);
   }

  name - The resource name for the ProductSet to modify. Format is: `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID` - `com.google.cloud.vision.v1p3beta1.ProductSetName`
  product - The resource name for the Product to be removed from this ProductSet. Format is: `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID` - `java.lang.String`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^ProductSearchClient this ^com.google.cloud.vision.v1p3beta1.ProductSetName name ^java.lang.String product]
    (-> this (.removeProductFromProductSet name product)))
  ([^ProductSearchClient this ^com.google.cloud.vision.v1p3beta1.RemoveProductFromProductSetRequest request]
    (-> this (.removeProductFromProductSet request))))

(defn delete-product
  "Permanently deletes a product and its reference images.

   Metadata of the product and all its images will be deleted right away, but search queries
   against ProductSets containing the product may still work until all related caches are
   refreshed.

   Possible errors:

   * Returns NOT_FOUND if the product does not exist.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     ProductName name = ProductName.of(\"[PROJECT]\", \"[LOCATION]\", \"[PRODUCT]\");
     productSearchClient.deleteProduct(name);
   }

  name - Resource name of product to delete. Format is: `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID` - `com.google.cloud.vision.v1p3beta1.ProductName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^ProductSearchClient this ^com.google.cloud.vision.v1p3beta1.ProductName name]
    (-> this (.deleteProduct name))))

(defn delete-product-set
  "Permanently deletes a ProductSet. All Products and ReferenceImages in the ProductSet will be
   deleted.

   The actual image files are not deleted from Google Cloud Storage.

   Possible errors:

   * Returns NOT_FOUND if the ProductSet does not exist.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     ProductSetName name = ProductSetName.of(\"[PROJECT]\", \"[LOCATION]\", \"[PRODUCT_SET]\");
     productSearchClient.deleteProductSet(name);
   }

  name - Resource name of the ProductSet to delete. Format is: `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID` - `com.google.cloud.vision.v1p3beta1.ProductSetName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^ProductSearchClient this ^com.google.cloud.vision.v1p3beta1.ProductSetName name]
    (-> this (.deleteProductSet name))))

(defn add-product-to-product-set
  "Adds a Product to the specified ProductSet. If the Product is already present, no change is
   made.

   One Product can be added to at most 100 ProductSets.

   Possible errors:

   * Returns NOT_FOUND if the Product or the ProductSet doesn't exist.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     ProductSetName name = ProductSetName.of(\"[PROJECT]\", \"[LOCATION]\", \"[PRODUCT_SET]\");
     String product = \"\";
     productSearchClient.addProductToProductSet(name, product);
   }

  name - The resource name for the ProductSet to modify. Format is: `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID` - `com.google.cloud.vision.v1p3beta1.ProductSetName`
  product - The resource name for the Product to be added to this ProductSet. Format is: `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID` - `java.lang.String`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^ProductSearchClient this ^com.google.cloud.vision.v1p3beta1.ProductSetName name ^java.lang.String product]
    (-> this (.addProductToProductSet name product)))
  ([^ProductSearchClient this ^com.google.cloud.vision.v1p3beta1.AddProductToProductSetRequest request]
    (-> this (.addProductToProductSet request))))

(defn list-products-callable
  "Lists products in an unspecified order.

   Possible errors:

   * Returns INVALID_ARGUMENT if page_size is greater than 100 or less than 1.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     ListProductsRequest request = ListProductsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListProductsResponse response = productSearchClient.listProductsCallable().call(request);
       for (Product element : response.getProductsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1p3beta1.ListProductsRequest,com.google.cloud.vision.v1p3beta1.ListProductsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProductSearchClient this]
    (-> this (.listProductsCallable))))

(defn get-settings
  "returns: `com.google.cloud.vision.v1p3beta1.ProductSearchSettings`"
  (^com.google.cloud.vision.v1p3beta1.ProductSearchSettings [^ProductSearchClient this]
    (-> this (.getSettings))))

(defn list-products-in-product-set
  "Lists the Products in a ProductSet, in an unspecified order. If the ProductSet does not exist,
   the products field of the response will be empty.

   Possible errors:

   * Returns INVALID_ARGUMENT if page_size is greater than 100 or less than 1.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     ProductSetName name = ProductSetName.of(\"[PROJECT]\", \"[LOCATION]\", \"[PRODUCT_SET]\");
     for (Product element : productSearchClient.listProductsInProductSet(name).iterateAll()) {
       // doThingsWith(element);
     }
   }

  name - The ProductSet resource for which to retrieve Products. Format is: `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID` - `com.google.cloud.vision.v1p3beta1.ProductSetName`

  returns: `com.google.cloud.vision.v1p3beta1.ProductSearchClient$ListProductsInProductSetPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.vision.v1p3beta1.ProductSearchClient$ListProductsInProductSetPagedResponse [^ProductSearchClient this ^com.google.cloud.vision.v1p3beta1.ProductSetName name]
    (-> this (.listProductsInProductSet name))))

(defn get-product-set
  "Gets information associated with a ProductSet.

   Possible errors:

   * Returns NOT_FOUND if the ProductSet does not exist.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     ProductSetName name = ProductSetName.of(\"[PROJECT]\", \"[LOCATION]\", \"[PRODUCT_SET]\");
     ProductSet response = productSearchClient.getProductSet(name);
   }

  name - Resource name of the ProductSet to get. Format is: `projects/PROJECT_ID/locations/LOG_ID/productSets/PRODUCT_SET_ID` - `com.google.cloud.vision.v1p3beta1.ProductSetName`

  returns: `com.google.cloud.vision.v1p3beta1.ProductSet`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.vision.v1p3beta1.ProductSet [^ProductSearchClient this ^com.google.cloud.vision.v1p3beta1.ProductSetName name]
    (-> this (.getProductSet name))))

(defn list-product-sets-callable
  "Lists ProductSets in an unspecified order.

   Possible errors:

   * Returns INVALID_ARGUMENT if page_size is greater than 100, or less than 1.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     ListProductSetsRequest request = ListProductSetsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListProductSetsResponse response = productSearchClient.listProductSetsCallable().call(request);
       for (ProductSet element : response.getProductSetsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1p3beta1.ListProductSetsRequest,com.google.cloud.vision.v1p3beta1.ListProductSetsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProductSearchClient this]
    (-> this (.listProductSetsCallable))))

(defn import-product-sets-operation-callable
  "Asynchronous API that imports a list of reference images to specified product sets based on a
   list of image information.

   The [google.longrunning.Operation][google.longrunning.Operation] API can be used to keep
   track of the progress and results of the request. `Operation.metadata` contains
   `BatchOperationMetadata`. (progress) `Operation.response` contains `ImportProductSetsResponse`.
   (results)

   The input source of this method is a csv file on Google Cloud Storage. For the format of the
   csv file please see
   [ImportProductSetsGcsSource.csv_file_uri][google.cloud.vision.v1p3beta1.ImportProductSetsGcsSource.csv_file_uri].

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     ImportProductSetsInputConfig inputConfig = ImportProductSetsInputConfig.newBuilder().build();
     ImportProductSetsRequest request = ImportProductSetsRequest.newBuilder()
       .setParent(parent.toString())
       .setInputConfig(inputConfig)
       .build();
     OperationFuture<ImportProductSetsResponse, BatchOperationMetadata> future = productSearchClient.importProductSetsOperationCallable().futureCall(request);
     // Do something
     ImportProductSetsResponse response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest,com.google.cloud.vision.v1p3beta1.ImportProductSetsResponse,com.google.cloud.vision.v1p3beta1.BatchOperationMetadata>`"
  ([^ProductSearchClient this]
    (-> this (.importProductSetsOperationCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.vision.v1p3beta1.stub.ProductSearchStub`"
  ([^ProductSearchClient this]
    (-> this (.getStub))))

(defn delete-reference-image-callable
  "Permanently deletes a reference image.

   The image metadata will be deleted right away, but search queries against ProductSets
   containing the image may still work until all related caches are refreshed.

   The actual image files are not deleted from Google Cloud Storage.

   Possible errors:

   * Returns NOT_FOUND if the reference image does not exist.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     ReferenceImageName name = ReferenceImageName.of(\"[PROJECT]\", \"[LOCATION]\", \"[PRODUCT]\", \"[REFERENCE_IMAGE]\");
     DeleteReferenceImageRequest request = DeleteReferenceImageRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = productSearchClient.deleteReferenceImageCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1p3beta1.DeleteReferenceImageRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProductSearchClient this]
    (-> this (.deleteReferenceImageCallable))))

(defn delete-reference-image
  "Permanently deletes a reference image.

   The image metadata will be deleted right away, but search queries against ProductSets
   containing the image may still work until all related caches are refreshed.

   The actual image files are not deleted from Google Cloud Storage.

   Possible errors:

   * Returns NOT_FOUND if the reference image does not exist.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     ReferenceImageName name = ReferenceImageName.of(\"[PROJECT]\", \"[LOCATION]\", \"[PRODUCT]\", \"[REFERENCE_IMAGE]\");
     productSearchClient.deleteReferenceImage(name);
   }

  name - The resource name of the reference image to delete. Format is: `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID/referenceImages/IMAGE_ID` - `com.google.cloud.vision.v1p3beta1.ReferenceImageName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^ProductSearchClient this ^com.google.cloud.vision.v1p3beta1.ReferenceImageName name]
    (-> this (.deleteReferenceImage name))))

(defn create-reference-image-callable
  "Creates and returns a new ReferenceImage resource.

   The `bounding_poly` field is optional. If `bounding_poly` is not specified, the system will
   try to detect regions of interest in the image that are compatible with the product_category on
   the parent product. If it is specified, detection is ALWAYS skipped. The system converts
   polygons into non-rotated rectangles.

   Note that the pipeline will resize the image if the image resolution is too large to process
   (above 50MP).

   Possible errors:

   * Returns INVALID_ARGUMENT if the image_uri is missing or longer than 4096 characters.
   * Returns INVALID_ARGUMENT if the product does not exist. * Returns INVALID_ARGUMENT if
   bounding_poly is not provided, and nothing compatible with the parent product's
   product_category is detected. * Returns INVALID_ARGUMENT if bounding_poly contains more
   than 10 polygons.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     ProductName parent = ProductName.of(\"[PROJECT]\", \"[LOCATION]\", \"[PRODUCT]\");
     ReferenceImage referenceImage = ReferenceImage.newBuilder().build();
     String referenceImageId = \"\";
     CreateReferenceImageRequest request = CreateReferenceImageRequest.newBuilder()
       .setParent(parent.toString())
       .setReferenceImage(referenceImage)
       .setReferenceImageId(referenceImageId)
       .build();
     ApiFuture<ReferenceImage> future = productSearchClient.createReferenceImageCallable().futureCall(request);
     // Do something
     ReferenceImage response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1p3beta1.CreateReferenceImageRequest,com.google.cloud.vision.v1p3beta1.ReferenceImage>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProductSearchClient this]
    (-> this (.createReferenceImageCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^ProductSearchClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^ProductSearchClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn list-product-sets
  "Lists ProductSets in an unspecified order.

   Possible errors:

   * Returns INVALID_ARGUMENT if page_size is greater than 100, or less than 1.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     for (ProductSet element : productSearchClient.listProductSets(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - The project from which ProductSets should be listed. Format is `projects/PROJECT_ID/locations/LOC_ID`. - `com.google.cloud.vision.v1p3beta1.LocationName`

  returns: `com.google.cloud.vision.v1p3beta1.ProductSearchClient$ListProductSetsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.vision.v1p3beta1.ProductSearchClient$ListProductSetsPagedResponse [^ProductSearchClient this ^com.google.cloud.vision.v1p3beta1.LocationName parent]
    (-> this (.listProductSets parent))))

(defn create-product-set-callable
  "Creates and returns a new ProductSet resource.

   Possible errors:

   * Returns INVALID_ARGUMENT if display_name is missing, or is longer than 4096
   characters.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     ProductSet productSet = ProductSet.newBuilder().build();
     String productSetId = \"\";
     CreateProductSetRequest request = CreateProductSetRequest.newBuilder()
       .setParent(parent.toString())
       .setProductSet(productSet)
       .setProductSetId(productSetId)
       .build();
     ApiFuture<ProductSet> future = productSearchClient.createProductSetCallable().futureCall(request);
     // Do something
     ProductSet response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1p3beta1.CreateProductSetRequest,com.google.cloud.vision.v1p3beta1.ProductSet>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProductSearchClient this]
    (-> this (.createProductSetCallable))))

(defn shutdown
  ""
  ([^ProductSearchClient this]
    (-> this (.shutdown))))

(defn add-product-to-product-set-callable
  "Adds a Product to the specified ProductSet. If the Product is already present, no change is
   made.

   One Product can be added to at most 100 ProductSets.

   Possible errors:

   * Returns NOT_FOUND if the Product or the ProductSet doesn't exist.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     ProductSetName name = ProductSetName.of(\"[PROJECT]\", \"[LOCATION]\", \"[PRODUCT_SET]\");
     String product = \"\";
     AddProductToProductSetRequest request = AddProductToProductSetRequest.newBuilder()
       .setName(name.toString())
       .setProduct(product)
       .build();
     ApiFuture<Void> future = productSearchClient.addProductToProductSetCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1p3beta1.AddProductToProductSetRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProductSearchClient this]
    (-> this (.addProductToProductSetCallable))))

(defn get-product-callable
  "Gets information associated with a Product.

   Possible errors:

   * Returns NOT_FOUND if the Product does not exist.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     ProductName name = ProductName.of(\"[PROJECT]\", \"[LOCATION]\", \"[PRODUCT]\");
     GetProductRequest request = GetProductRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Product> future = productSearchClient.getProductCallable().futureCall(request);
     // Do something
     Product response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1p3beta1.GetProductRequest,com.google.cloud.vision.v1p3beta1.Product>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProductSearchClient this]
    (-> this (.getProductCallable))))

(defn update-product
  "Makes changes to a Product resource. Only display_name, description and labels can be updated
   right now.

   If labels are updated, the change will not be reflected in queries until the next index
   time.

   Possible errors:

   * Returns NOT_FOUND if the Product does not exist. * Returns INVALID_ARGUMENT if
   display_name is present in update_mask but is missing from the request or longer than 4096
   characters. * Returns INVALID_ARGUMENT if description is present in update_mask but is
   longer than 4096 characters. * Returns INVALID_ARGUMENT if product_category is present in
   update_mask.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     Product product = Product.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     Product response = productSearchClient.updateProduct(product, updateMask);
   }

  product - The Product resource which replaces the one on the server. product.name is immutable. - `com.google.cloud.vision.v1p3beta1.Product`
  update-mask - The [FieldMask][google.protobuf.FieldMask] that specifies which fields to update. If update_mask isn't specified, all mutable fields are to be updated. Valid mask paths include `product_labels`, `display_name` and `description`. - `com.google.protobuf.FieldMask`

  returns: `com.google.cloud.vision.v1p3beta1.Product`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.vision.v1p3beta1.Product [^ProductSearchClient this ^com.google.cloud.vision.v1p3beta1.Product product ^com.google.protobuf.FieldMask update-mask]
    (-> this (.updateProduct product update-mask)))
  (^com.google.cloud.vision.v1p3beta1.Product [^ProductSearchClient this ^com.google.cloud.vision.v1p3beta1.UpdateProductRequest request]
    (-> this (.updateProduct request))))

(defn list-products-in-product-set-paged-callable
  "Lists the Products in a ProductSet, in an unspecified order. If the ProductSet does not exist,
   the products field of the response will be empty.

   Possible errors:

   * Returns INVALID_ARGUMENT if page_size is greater than 100 or less than 1.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     ProductSetName name = ProductSetName.of(\"[PROJECT]\", \"[LOCATION]\", \"[PRODUCT_SET]\");
     ListProductsInProductSetRequest request = ListProductsInProductSetRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<ListProductsInProductSetPagedResponse> future = productSearchClient.listProductsInProductSetPagedCallable().futureCall(request);
     // Do something
     for (Product element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1p3beta1.ListProductsInProductSetRequest,com.google.cloud.vision.v1p3beta1.ProductSearchClient$ListProductsInProductSetPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProductSearchClient this]
    (-> this (.listProductsInProductSetPagedCallable))))

(defn list-products-paged-callable
  "Lists products in an unspecified order.

   Possible errors:

   * Returns INVALID_ARGUMENT if page_size is greater than 100 or less than 1.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     ListProductsRequest request = ListProductsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListProductsPagedResponse> future = productSearchClient.listProductsPagedCallable().futureCall(request);
     // Do something
     for (Product element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1p3beta1.ListProductsRequest,com.google.cloud.vision.v1p3beta1.ProductSearchClient$ListProductsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProductSearchClient this]
    (-> this (.listProductsPagedCallable))))

(defn list-reference-images
  "Lists reference images.

   Possible errors:

   * Returns NOT_FOUND if the parent product does not exist. * Returns INVALID_ARGUMENT
   if the page_size is greater than 100, or less than 1.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     ProductName parent = ProductName.of(\"[PROJECT]\", \"[LOCATION]\", \"[PRODUCT]\");
     for (ReferenceImage element : productSearchClient.listReferenceImages(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Resource name of the product containing the reference images. Format is `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`. - `com.google.cloud.vision.v1p3beta1.ProductName`

  returns: `com.google.cloud.vision.v1p3beta1.ProductSearchClient$ListReferenceImagesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.vision.v1p3beta1.ProductSearchClient$ListReferenceImagesPagedResponse [^ProductSearchClient this ^com.google.cloud.vision.v1p3beta1.ProductName parent]
    (-> this (.listReferenceImages parent))))

(defn get-operations-client
  "Returns the OperationsClient that can be used to query the status of a long-running operation
   returned by another API method call.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.longrunning.OperationsClient`"
  ([^ProductSearchClient this]
    (-> this (.getOperationsClient))))

(defn remove-product-from-product-set-callable
  "Removes a Product from the specified ProductSet.

   Possible errors:

   * Returns NOT_FOUND If the Product is not found under the ProductSet.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     ProductSetName name = ProductSetName.of(\"[PROJECT]\", \"[LOCATION]\", \"[PRODUCT_SET]\");
     String product = \"\";
     RemoveProductFromProductSetRequest request = RemoveProductFromProductSetRequest.newBuilder()
       .setName(name.toString())
       .setProduct(product)
       .build();
     ApiFuture<Void> future = productSearchClient.removeProductFromProductSetCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1p3beta1.RemoveProductFromProductSetRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProductSearchClient this]
    (-> this (.removeProductFromProductSetCallable))))

(defn list-reference-images-callable
  "Lists reference images.

   Possible errors:

   * Returns NOT_FOUND if the parent product does not exist. * Returns INVALID_ARGUMENT
   if the page_size is greater than 100, or less than 1.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     ProductName parent = ProductName.of(\"[PROJECT]\", \"[LOCATION]\", \"[PRODUCT]\");
     ListReferenceImagesRequest request = ListReferenceImagesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListReferenceImagesResponse response = productSearchClient.listReferenceImagesCallable().call(request);
       for (ReferenceImage element : response.getReferenceImagesList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1p3beta1.ListReferenceImagesRequest,com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProductSearchClient this]
    (-> this (.listReferenceImagesCallable))))

(defn close
  ""
  ([^ProductSearchClient this]
    (-> this (.close))))

(defn list-products-in-product-set-callable
  "Lists the Products in a ProductSet, in an unspecified order. If the ProductSet does not exist,
   the products field of the response will be empty.

   Possible errors:

   * Returns INVALID_ARGUMENT if page_size is greater than 100 or less than 1.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     ProductSetName name = ProductSetName.of(\"[PROJECT]\", \"[LOCATION]\", \"[PRODUCT_SET]\");
     ListProductsInProductSetRequest request = ListProductsInProductSetRequest.newBuilder()
       .setName(name.toString())
       .build();
     while (true) {
       ListProductsInProductSetResponse response = productSearchClient.listProductsInProductSetCallable().call(request);
       for (Product element : response.getProductsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1p3beta1.ListProductsInProductSetRequest,com.google.cloud.vision.v1p3beta1.ListProductsInProductSetResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProductSearchClient this]
    (-> this (.listProductsInProductSetCallable))))

(defn delete-product-callable
  "Permanently deletes a product and its reference images.

   Metadata of the product and all its images will be deleted right away, but search queries
   against ProductSets containing the product may still work until all related caches are
   refreshed.

   Possible errors:

   * Returns NOT_FOUND if the product does not exist.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     ProductName name = ProductName.of(\"[PROJECT]\", \"[LOCATION]\", \"[PRODUCT]\");
     DeleteProductRequest request = DeleteProductRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = productSearchClient.deleteProductCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1p3beta1.DeleteProductRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProductSearchClient this]
    (-> this (.deleteProductCallable))))

(defn update-product-callable
  "Makes changes to a Product resource. Only display_name, description and labels can be updated
   right now.

   If labels are updated, the change will not be reflected in queries until the next index
   time.

   Possible errors:

   * Returns NOT_FOUND if the Product does not exist. * Returns INVALID_ARGUMENT if
   display_name is present in update_mask but is missing from the request or longer than 4096
   characters. * Returns INVALID_ARGUMENT if description is present in update_mask but is
   longer than 4096 characters. * Returns INVALID_ARGUMENT if product_category is present in
   update_mask.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     Product product = Product.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     UpdateProductRequest request = UpdateProductRequest.newBuilder()
       .setProduct(product)
       .setUpdateMask(updateMask)
       .build();
     ApiFuture<Product> future = productSearchClient.updateProductCallable().futureCall(request);
     // Do something
     Product response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1p3beta1.UpdateProductRequest,com.google.cloud.vision.v1p3beta1.Product>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProductSearchClient this]
    (-> this (.updateProductCallable))))

(defn create-product
  "Creates and returns a new product resource.

   Possible errors:

   * Returns INVALID_ARGUMENT if display_name is missing or longer than 4096 characters.
   * Returns INVALID_ARGUMENT if description is longer than 4096 characters. * Returns
   INVALID_ARGUMENT if product_category is missing or invalid.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     Product product = Product.newBuilder().build();
     String productId = \"\";
     Product response = productSearchClient.createProduct(parent, product, productId);
   }

  parent - The project in which the Product should be created. Format is `projects/PROJECT_ID/locations/LOC_ID`. - `com.google.cloud.vision.v1p3beta1.LocationName`
  product - The product to create. - `com.google.cloud.vision.v1p3beta1.Product`
  product-id - A user-supplied resource id for this Product. If set, the server will attempt to use this value as the resource id. If it is already in use, an error is returned with code ALREADY_EXISTS. Must be at most 128 characters long. It cannot contain the character `/`. - `java.lang.String`

  returns: `com.google.cloud.vision.v1p3beta1.Product`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.vision.v1p3beta1.Product [^ProductSearchClient this ^com.google.cloud.vision.v1p3beta1.LocationName parent ^com.google.cloud.vision.v1p3beta1.Product product ^java.lang.String product-id]
    (-> this (.createProduct parent product product-id)))
  (^com.google.cloud.vision.v1p3beta1.Product [^ProductSearchClient this ^com.google.cloud.vision.v1p3beta1.CreateProductRequest request]
    (-> this (.createProduct request))))

(defn import-product-sets-async
  "Asynchronous API that imports a list of reference images to specified product sets based on a
   list of image information.

   The [google.longrunning.Operation][google.longrunning.Operation] API can be used to keep
   track of the progress and results of the request. `Operation.metadata` contains
   `BatchOperationMetadata`. (progress) `Operation.response` contains `ImportProductSetsResponse`.
   (results)

   The input source of this method is a csv file on Google Cloud Storage. For the format of the
   csv file please see
   [ImportProductSetsGcsSource.csv_file_uri][google.cloud.vision.v1p3beta1.ImportProductSetsGcsSource.csv_file_uri].

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     ImportProductSetsInputConfig inputConfig = ImportProductSetsInputConfig.newBuilder().build();
     ImportProductSetsResponse response = productSearchClient.importProductSetsAsync(parent, inputConfig).get();
   }

  parent - The project in which the ProductSets should be imported. Format is `projects/PROJECT_ID/locations/LOC_ID`. - `com.google.cloud.vision.v1p3beta1.LocationName`
  input-config - The input content for the list of requests. - `com.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfig`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.vision.v1p3beta1.ImportProductSetsResponse,com.google.cloud.vision.v1p3beta1.BatchOperationMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^ProductSearchClient this ^com.google.cloud.vision.v1p3beta1.LocationName parent ^com.google.cloud.vision.v1p3beta1.ImportProductSetsInputConfig input-config]
    (-> this (.importProductSetsAsync parent input-config)))
  ([^ProductSearchClient this ^com.google.cloud.vision.v1p3beta1.ImportProductSetsRequest request]
    (-> this (.importProductSetsAsync request))))

(defn list-product-sets-paged-callable
  "Lists ProductSets in an unspecified order.

   Possible errors:

   * Returns INVALID_ARGUMENT if page_size is greater than 100, or less than 1.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     ListProductSetsRequest request = ListProductSetsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListProductSetsPagedResponse> future = productSearchClient.listProductSetsPagedCallable().futureCall(request);
     // Do something
     for (ProductSet element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1p3beta1.ListProductSetsRequest,com.google.cloud.vision.v1p3beta1.ProductSearchClient$ListProductSetsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProductSearchClient this]
    (-> this (.listProductSetsPagedCallable))))

(defn update-product-set
  "Makes changes to a ProductSet resource. Only display_name can be updated currently.

   Possible errors:

   * Returns NOT_FOUND if the ProductSet does not exist. * Returns INVALID_ARGUMENT if
   display_name is present in update_mask but missing from the request or longer than 4096
   characters.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     ProductSet productSet = ProductSet.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     ProductSet response = productSearchClient.updateProductSet(productSet, updateMask);
   }

  product-set - The ProductSet resource which replaces the one on the server. - `com.google.cloud.vision.v1p3beta1.ProductSet`
  update-mask - The [FieldMask][google.protobuf.FieldMask] that specifies which fields to update. If update_mask isn't specified, all mutable fields are to be updated. Valid mask path is `display_name`. - `com.google.protobuf.FieldMask`

  returns: `com.google.cloud.vision.v1p3beta1.ProductSet`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.vision.v1p3beta1.ProductSet [^ProductSearchClient this ^com.google.cloud.vision.v1p3beta1.ProductSet product-set ^com.google.protobuf.FieldMask update-mask]
    (-> this (.updateProductSet product-set update-mask)))
  (^com.google.cloud.vision.v1p3beta1.ProductSet [^ProductSearchClient this ^com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest request]
    (-> this (.updateProductSet request))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^ProductSearchClient this]
    (-> this (.isTerminated))))

(defn update-product-set-callable
  "Makes changes to a ProductSet resource. Only display_name can be updated currently.

   Possible errors:

   * Returns NOT_FOUND if the ProductSet does not exist. * Returns INVALID_ARGUMENT if
   display_name is present in update_mask but missing from the request or longer than 4096
   characters.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     ProductSet productSet = ProductSet.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     UpdateProductSetRequest request = UpdateProductSetRequest.newBuilder()
       .setProductSet(productSet)
       .setUpdateMask(updateMask)
       .build();
     ApiFuture<ProductSet> future = productSearchClient.updateProductSetCallable().futureCall(request);
     // Do something
     ProductSet response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1p3beta1.UpdateProductSetRequest,com.google.cloud.vision.v1p3beta1.ProductSet>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProductSearchClient this]
    (-> this (.updateProductSetCallable))))

(defn list-products
  "Lists products in an unspecified order.

   Possible errors:

   * Returns INVALID_ARGUMENT if page_size is greater than 100 or less than 1.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     for (Product element : productSearchClient.listProducts(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - The project OR ProductSet from which Products should be listed. Format: `projects/PROJECT_ID/locations/LOC_ID` - `com.google.cloud.vision.v1p3beta1.LocationName`

  returns: `com.google.cloud.vision.v1p3beta1.ProductSearchClient$ListProductsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.vision.v1p3beta1.ProductSearchClient$ListProductsPagedResponse [^ProductSearchClient this ^com.google.cloud.vision.v1p3beta1.LocationName parent]
    (-> this (.listProducts parent))))

(defn get-reference-image-callable
  "Gets information associated with a ReferenceImage.

   Possible errors:

   * Returns NOT_FOUND if the specified image does not exist.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     ReferenceImageName name = ReferenceImageName.of(\"[PROJECT]\", \"[LOCATION]\", \"[PRODUCT]\", \"[REFERENCE_IMAGE]\");
     GetReferenceImageRequest request = GetReferenceImageRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<ReferenceImage> future = productSearchClient.getReferenceImageCallable().futureCall(request);
     // Do something
     ReferenceImage response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1p3beta1.GetReferenceImageRequest,com.google.cloud.vision.v1p3beta1.ReferenceImage>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProductSearchClient this]
    (-> this (.getReferenceImageCallable))))

(defn create-product-set
  "Creates and returns a new ProductSet resource.

   Possible errors:

   * Returns INVALID_ARGUMENT if display_name is missing, or is longer than 4096
   characters.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     LocationName parent = LocationName.of(\"[PROJECT]\", \"[LOCATION]\");
     ProductSet productSet = ProductSet.newBuilder().build();
     String productSetId = \"\";
     ProductSet response = productSearchClient.createProductSet(parent, productSet, productSetId);
   }

  parent - The project in which the ProductSet should be created. Format is `projects/PROJECT_ID/locations/LOC_ID`. - `com.google.cloud.vision.v1p3beta1.LocationName`
  product-set - The ProductSet to create. - `com.google.cloud.vision.v1p3beta1.ProductSet`
  product-set-id - A user-supplied resource id for this ProductSet. If set, the server will attempt to use this value as the resource id. If it is already in use, an error is returned with code ALREADY_EXISTS. Must be at most 128 characters long. It cannot contain the character `/`. - `java.lang.String`

  returns: `com.google.cloud.vision.v1p3beta1.ProductSet`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.vision.v1p3beta1.ProductSet [^ProductSearchClient this ^com.google.cloud.vision.v1p3beta1.LocationName parent ^com.google.cloud.vision.v1p3beta1.ProductSet product-set ^java.lang.String product-set-id]
    (-> this (.createProductSet parent product-set product-set-id)))
  (^com.google.cloud.vision.v1p3beta1.ProductSet [^ProductSearchClient this ^com.google.cloud.vision.v1p3beta1.CreateProductSetRequest request]
    (-> this (.createProductSet request))))

(defn create-reference-image
  "Creates and returns a new ReferenceImage resource.

   The `bounding_poly` field is optional. If `bounding_poly` is not specified, the system will
   try to detect regions of interest in the image that are compatible with the product_category on
   the parent product. If it is specified, detection is ALWAYS skipped. The system converts
   polygons into non-rotated rectangles.

   Note that the pipeline will resize the image if the image resolution is too large to process
   (above 50MP).

   Possible errors:

   * Returns INVALID_ARGUMENT if the image_uri is missing or longer than 4096 characters.
   * Returns INVALID_ARGUMENT if the product does not exist. * Returns INVALID_ARGUMENT if
   bounding_poly is not provided, and nothing compatible with the parent product's
   product_category is detected. * Returns INVALID_ARGUMENT if bounding_poly contains more
   than 10 polygons.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     ProductName parent = ProductName.of(\"[PROJECT]\", \"[LOCATION]\", \"[PRODUCT]\");
     ReferenceImage referenceImage = ReferenceImage.newBuilder().build();
     String referenceImageId = \"\";
     ReferenceImage response = productSearchClient.createReferenceImage(parent, referenceImage, referenceImageId);
   }

  parent - Resource name of the product in which to create the reference image. Format is `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`. - `com.google.cloud.vision.v1p3beta1.ProductName`
  reference-image - The reference image to create. If an image ID is specified, it is ignored. - `com.google.cloud.vision.v1p3beta1.ReferenceImage`
  reference-image-id - A user-supplied resource id for the ReferenceImage to be added. If set, the server will attempt to use this value as the resource id. If it is already in use, an error is returned with code ALREADY_EXISTS. Must be at most 128 characters long. It cannot contain the character `/`. - `java.lang.String`

  returns: `com.google.cloud.vision.v1p3beta1.ReferenceImage`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.vision.v1p3beta1.ReferenceImage [^ProductSearchClient this ^com.google.cloud.vision.v1p3beta1.ProductName parent ^com.google.cloud.vision.v1p3beta1.ReferenceImage reference-image ^java.lang.String reference-image-id]
    (-> this (.createReferenceImage parent reference-image reference-image-id)))
  (^com.google.cloud.vision.v1p3beta1.ReferenceImage [^ProductSearchClient this ^com.google.cloud.vision.v1p3beta1.CreateReferenceImageRequest request]
    (-> this (.createReferenceImage request))))

(defn list-reference-images-paged-callable
  "Lists reference images.

   Possible errors:

   * Returns NOT_FOUND if the parent product does not exist. * Returns INVALID_ARGUMENT
   if the page_size is greater than 100, or less than 1.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     ProductName parent = ProductName.of(\"[PROJECT]\", \"[LOCATION]\", \"[PRODUCT]\");
     ListReferenceImagesRequest request = ListReferenceImagesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListReferenceImagesPagedResponse> future = productSearchClient.listReferenceImagesPagedCallable().futureCall(request);
     // Do something
     for (ReferenceImage element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1p3beta1.ListReferenceImagesRequest,com.google.cloud.vision.v1p3beta1.ProductSearchClient$ListReferenceImagesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProductSearchClient this]
    (-> this (.listReferenceImagesPagedCallable))))

(defn shutdown-now
  ""
  ([^ProductSearchClient this]
    (-> this (.shutdownNow))))

(defn delete-product-set-callable
  "Permanently deletes a ProductSet. All Products and ReferenceImages in the ProductSet will be
   deleted.

   The actual image files are not deleted from Google Cloud Storage.

   Possible errors:

   * Returns NOT_FOUND if the ProductSet does not exist.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     ProductSetName name = ProductSetName.of(\"[PROJECT]\", \"[LOCATION]\", \"[PRODUCT_SET]\");
     DeleteProductSetRequest request = DeleteProductSetRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = productSearchClient.deleteProductSetCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.vision.v1p3beta1.DeleteProductSetRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProductSearchClient this]
    (-> this (.deleteProductSetCallable))))

(defn get-product
  "Gets information associated with a Product.

   Possible errors:

   * Returns NOT_FOUND if the Product does not exist.

   Sample code:



   try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
     ProductName name = ProductName.of(\"[PROJECT]\", \"[LOCATION]\", \"[PRODUCT]\");
     Product response = productSearchClient.getProduct(name);
   }

  name - Resource name of the Product to get. Format is: `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID` - `com.google.cloud.vision.v1p3beta1.ProductName`

  returns: `com.google.cloud.vision.v1p3beta1.Product`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.vision.v1p3beta1.Product [^ProductSearchClient this ^com.google.cloud.vision.v1p3beta1.ProductName name]
    (-> this (.getProduct name))))

