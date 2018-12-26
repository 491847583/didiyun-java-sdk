// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bill/v1/bill.proto

package com.didiyun.bill.v1;

/**
 * Protobuf type {@code didi.cloud.bill.v1.CheckEbsPriceRequest}
 */
public  final class CheckEbsPriceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:didi.cloud.bill.v1.CheckEbsPriceRequest)
    CheckEbsPriceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CheckEbsPriceRequest.newBuilder() to construct.
  private CheckEbsPriceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CheckEbsPriceRequest() {
    checkCoupon_ = false;
    isChange_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CheckEbsPriceRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.didiyun.base.v1.Header.Builder subBuilder = null;
            if (header_ != null) {
              subBuilder = header_.toBuilder();
            }
            header_ = input.readMessage(com.didiyun.base.v1.Header.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(header_);
              header_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            checkCoupon_ = input.readBool();
            break;
          }
          case 24: {

            isChange_ = input.readBool();
            break;
          }
          case 34: {
            com.didiyun.bill.v1.CheckEbsPriceInput.Builder subBuilder = null;
            if (ebsGoods_ != null) {
              subBuilder = ebsGoods_.toBuilder();
            }
            ebsGoods_ = input.readMessage(com.didiyun.bill.v1.CheckEbsPriceInput.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(ebsGoods_);
              ebsGoods_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.didiyun.bill.v1.BillOuterClass.internal_static_didi_cloud_bill_v1_CheckEbsPriceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.didiyun.bill.v1.BillOuterClass.internal_static_didi_cloud_bill_v1_CheckEbsPriceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.didiyun.bill.v1.CheckEbsPriceRequest.class, com.didiyun.bill.v1.CheckEbsPriceRequest.Builder.class);
  }

  public static final int HEADER_FIELD_NUMBER = 1;
  private com.didiyun.base.v1.Header header_;
  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   */
  public boolean hasHeader() {
    return header_ != null;
  }
  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   */
  public com.didiyun.base.v1.Header getHeader() {
    return header_ == null ? com.didiyun.base.v1.Header.getDefaultInstance() : header_;
  }
  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   */
  public com.didiyun.base.v1.HeaderOrBuilder getHeaderOrBuilder() {
    return getHeader();
  }

  public static final int CHECKCOUPON_FIELD_NUMBER = 2;
  private boolean checkCoupon_;
  /**
   * <code>bool checkCoupon = 2;</code>
   */
  public boolean getCheckCoupon() {
    return checkCoupon_;
  }

  public static final int ISCHANGE_FIELD_NUMBER = 3;
  private boolean isChange_;
  /**
   * <code>bool isChange = 3;</code>
   */
  public boolean getIsChange() {
    return isChange_;
  }

  public static final int EBSGOODS_FIELD_NUMBER = 4;
  private com.didiyun.bill.v1.CheckEbsPriceInput ebsGoods_;
  /**
   * <code>.didi.cloud.bill.v1.CheckEbsPriceInput ebsGoods = 4;</code>
   */
  public boolean hasEbsGoods() {
    return ebsGoods_ != null;
  }
  /**
   * <code>.didi.cloud.bill.v1.CheckEbsPriceInput ebsGoods = 4;</code>
   */
  public com.didiyun.bill.v1.CheckEbsPriceInput getEbsGoods() {
    return ebsGoods_ == null ? com.didiyun.bill.v1.CheckEbsPriceInput.getDefaultInstance() : ebsGoods_;
  }
  /**
   * <code>.didi.cloud.bill.v1.CheckEbsPriceInput ebsGoods = 4;</code>
   */
  public com.didiyun.bill.v1.CheckEbsPriceInputOrBuilder getEbsGoodsOrBuilder() {
    return getEbsGoods();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (header_ != null) {
      output.writeMessage(1, getHeader());
    }
    if (checkCoupon_ != false) {
      output.writeBool(2, checkCoupon_);
    }
    if (isChange_ != false) {
      output.writeBool(3, isChange_);
    }
    if (ebsGoods_ != null) {
      output.writeMessage(4, getEbsGoods());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (header_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHeader());
    }
    if (checkCoupon_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, checkCoupon_);
    }
    if (isChange_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isChange_);
    }
    if (ebsGoods_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getEbsGoods());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.didiyun.bill.v1.CheckEbsPriceRequest)) {
      return super.equals(obj);
    }
    com.didiyun.bill.v1.CheckEbsPriceRequest other = (com.didiyun.bill.v1.CheckEbsPriceRequest) obj;

    boolean result = true;
    result = result && (hasHeader() == other.hasHeader());
    if (hasHeader()) {
      result = result && getHeader()
          .equals(other.getHeader());
    }
    result = result && (getCheckCoupon()
        == other.getCheckCoupon());
    result = result && (getIsChange()
        == other.getIsChange());
    result = result && (hasEbsGoods() == other.hasEbsGoods());
    if (hasEbsGoods()) {
      result = result && getEbsGoods()
          .equals(other.getEbsGoods());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    hash = (37 * hash) + CHECKCOUPON_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getCheckCoupon());
    hash = (37 * hash) + ISCHANGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsChange());
    if (hasEbsGoods()) {
      hash = (37 * hash) + EBSGOODS_FIELD_NUMBER;
      hash = (53 * hash) + getEbsGoods().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.didiyun.bill.v1.CheckEbsPriceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.bill.v1.CheckEbsPriceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.bill.v1.CheckEbsPriceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.bill.v1.CheckEbsPriceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.bill.v1.CheckEbsPriceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.bill.v1.CheckEbsPriceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.bill.v1.CheckEbsPriceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.bill.v1.CheckEbsPriceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.bill.v1.CheckEbsPriceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.didiyun.bill.v1.CheckEbsPriceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.bill.v1.CheckEbsPriceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.bill.v1.CheckEbsPriceRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.didiyun.bill.v1.CheckEbsPriceRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code didi.cloud.bill.v1.CheckEbsPriceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:didi.cloud.bill.v1.CheckEbsPriceRequest)
      com.didiyun.bill.v1.CheckEbsPriceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.didiyun.bill.v1.BillOuterClass.internal_static_didi_cloud_bill_v1_CheckEbsPriceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.didiyun.bill.v1.BillOuterClass.internal_static_didi_cloud_bill_v1_CheckEbsPriceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.didiyun.bill.v1.CheckEbsPriceRequest.class, com.didiyun.bill.v1.CheckEbsPriceRequest.Builder.class);
    }

    // Construct using com.didiyun.bill.v1.CheckEbsPriceRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (headerBuilder_ == null) {
        header_ = null;
      } else {
        header_ = null;
        headerBuilder_ = null;
      }
      checkCoupon_ = false;

      isChange_ = false;

      if (ebsGoodsBuilder_ == null) {
        ebsGoods_ = null;
      } else {
        ebsGoods_ = null;
        ebsGoodsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.didiyun.bill.v1.BillOuterClass.internal_static_didi_cloud_bill_v1_CheckEbsPriceRequest_descriptor;
    }

    @java.lang.Override
    public com.didiyun.bill.v1.CheckEbsPriceRequest getDefaultInstanceForType() {
      return com.didiyun.bill.v1.CheckEbsPriceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.didiyun.bill.v1.CheckEbsPriceRequest build() {
      com.didiyun.bill.v1.CheckEbsPriceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.didiyun.bill.v1.CheckEbsPriceRequest buildPartial() {
      com.didiyun.bill.v1.CheckEbsPriceRequest result = new com.didiyun.bill.v1.CheckEbsPriceRequest(this);
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      result.checkCoupon_ = checkCoupon_;
      result.isChange_ = isChange_;
      if (ebsGoodsBuilder_ == null) {
        result.ebsGoods_ = ebsGoods_;
      } else {
        result.ebsGoods_ = ebsGoodsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.didiyun.bill.v1.CheckEbsPriceRequest) {
        return mergeFrom((com.didiyun.bill.v1.CheckEbsPriceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.didiyun.bill.v1.CheckEbsPriceRequest other) {
      if (other == com.didiyun.bill.v1.CheckEbsPriceRequest.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (other.getCheckCoupon() != false) {
        setCheckCoupon(other.getCheckCoupon());
      }
      if (other.getIsChange() != false) {
        setIsChange(other.getIsChange());
      }
      if (other.hasEbsGoods()) {
        mergeEbsGoods(other.getEbsGoods());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.didiyun.bill.v1.CheckEbsPriceRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.didiyun.bill.v1.CheckEbsPriceRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.didiyun.base.v1.Header header_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.didiyun.base.v1.Header, com.didiyun.base.v1.Header.Builder, com.didiyun.base.v1.HeaderOrBuilder> headerBuilder_;
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public boolean hasHeader() {
      return headerBuilder_ != null || header_ != null;
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public com.didiyun.base.v1.Header getHeader() {
      if (headerBuilder_ == null) {
        return header_ == null ? com.didiyun.base.v1.Header.getDefaultInstance() : header_;
      } else {
        return headerBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public Builder setHeader(com.didiyun.base.v1.Header value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        header_ = value;
        onChanged();
      } else {
        headerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public Builder setHeader(
        com.didiyun.base.v1.Header.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
        onChanged();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public Builder mergeHeader(com.didiyun.base.v1.Header value) {
      if (headerBuilder_ == null) {
        if (header_ != null) {
          header_ =
            com.didiyun.base.v1.Header.newBuilder(header_).mergeFrom(value).buildPartial();
        } else {
          header_ = value;
        }
        onChanged();
      } else {
        headerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public Builder clearHeader() {
      if (headerBuilder_ == null) {
        header_ = null;
        onChanged();
      } else {
        header_ = null;
        headerBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public com.didiyun.base.v1.Header.Builder getHeaderBuilder() {
      
      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public com.didiyun.base.v1.HeaderOrBuilder getHeaderOrBuilder() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilder();
      } else {
        return header_ == null ?
            com.didiyun.base.v1.Header.getDefaultInstance() : header_;
      }
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.didiyun.base.v1.Header, com.didiyun.base.v1.Header.Builder, com.didiyun.base.v1.HeaderOrBuilder> 
        getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.didiyun.base.v1.Header, com.didiyun.base.v1.Header.Builder, com.didiyun.base.v1.HeaderOrBuilder>(
                getHeader(),
                getParentForChildren(),
                isClean());
        header_ = null;
      }
      return headerBuilder_;
    }

    private boolean checkCoupon_ ;
    /**
     * <code>bool checkCoupon = 2;</code>
     */
    public boolean getCheckCoupon() {
      return checkCoupon_;
    }
    /**
     * <code>bool checkCoupon = 2;</code>
     */
    public Builder setCheckCoupon(boolean value) {
      
      checkCoupon_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool checkCoupon = 2;</code>
     */
    public Builder clearCheckCoupon() {
      
      checkCoupon_ = false;
      onChanged();
      return this;
    }

    private boolean isChange_ ;
    /**
     * <code>bool isChange = 3;</code>
     */
    public boolean getIsChange() {
      return isChange_;
    }
    /**
     * <code>bool isChange = 3;</code>
     */
    public Builder setIsChange(boolean value) {
      
      isChange_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool isChange = 3;</code>
     */
    public Builder clearIsChange() {
      
      isChange_ = false;
      onChanged();
      return this;
    }

    private com.didiyun.bill.v1.CheckEbsPriceInput ebsGoods_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.didiyun.bill.v1.CheckEbsPriceInput, com.didiyun.bill.v1.CheckEbsPriceInput.Builder, com.didiyun.bill.v1.CheckEbsPriceInputOrBuilder> ebsGoodsBuilder_;
    /**
     * <code>.didi.cloud.bill.v1.CheckEbsPriceInput ebsGoods = 4;</code>
     */
    public boolean hasEbsGoods() {
      return ebsGoodsBuilder_ != null || ebsGoods_ != null;
    }
    /**
     * <code>.didi.cloud.bill.v1.CheckEbsPriceInput ebsGoods = 4;</code>
     */
    public com.didiyun.bill.v1.CheckEbsPriceInput getEbsGoods() {
      if (ebsGoodsBuilder_ == null) {
        return ebsGoods_ == null ? com.didiyun.bill.v1.CheckEbsPriceInput.getDefaultInstance() : ebsGoods_;
      } else {
        return ebsGoodsBuilder_.getMessage();
      }
    }
    /**
     * <code>.didi.cloud.bill.v1.CheckEbsPriceInput ebsGoods = 4;</code>
     */
    public Builder setEbsGoods(com.didiyun.bill.v1.CheckEbsPriceInput value) {
      if (ebsGoodsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ebsGoods_ = value;
        onChanged();
      } else {
        ebsGoodsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.didi.cloud.bill.v1.CheckEbsPriceInput ebsGoods = 4;</code>
     */
    public Builder setEbsGoods(
        com.didiyun.bill.v1.CheckEbsPriceInput.Builder builderForValue) {
      if (ebsGoodsBuilder_ == null) {
        ebsGoods_ = builderForValue.build();
        onChanged();
      } else {
        ebsGoodsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.didi.cloud.bill.v1.CheckEbsPriceInput ebsGoods = 4;</code>
     */
    public Builder mergeEbsGoods(com.didiyun.bill.v1.CheckEbsPriceInput value) {
      if (ebsGoodsBuilder_ == null) {
        if (ebsGoods_ != null) {
          ebsGoods_ =
            com.didiyun.bill.v1.CheckEbsPriceInput.newBuilder(ebsGoods_).mergeFrom(value).buildPartial();
        } else {
          ebsGoods_ = value;
        }
        onChanged();
      } else {
        ebsGoodsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.didi.cloud.bill.v1.CheckEbsPriceInput ebsGoods = 4;</code>
     */
    public Builder clearEbsGoods() {
      if (ebsGoodsBuilder_ == null) {
        ebsGoods_ = null;
        onChanged();
      } else {
        ebsGoods_ = null;
        ebsGoodsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.didi.cloud.bill.v1.CheckEbsPriceInput ebsGoods = 4;</code>
     */
    public com.didiyun.bill.v1.CheckEbsPriceInput.Builder getEbsGoodsBuilder() {
      
      onChanged();
      return getEbsGoodsFieldBuilder().getBuilder();
    }
    /**
     * <code>.didi.cloud.bill.v1.CheckEbsPriceInput ebsGoods = 4;</code>
     */
    public com.didiyun.bill.v1.CheckEbsPriceInputOrBuilder getEbsGoodsOrBuilder() {
      if (ebsGoodsBuilder_ != null) {
        return ebsGoodsBuilder_.getMessageOrBuilder();
      } else {
        return ebsGoods_ == null ?
            com.didiyun.bill.v1.CheckEbsPriceInput.getDefaultInstance() : ebsGoods_;
      }
    }
    /**
     * <code>.didi.cloud.bill.v1.CheckEbsPriceInput ebsGoods = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.didiyun.bill.v1.CheckEbsPriceInput, com.didiyun.bill.v1.CheckEbsPriceInput.Builder, com.didiyun.bill.v1.CheckEbsPriceInputOrBuilder> 
        getEbsGoodsFieldBuilder() {
      if (ebsGoodsBuilder_ == null) {
        ebsGoodsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.didiyun.bill.v1.CheckEbsPriceInput, com.didiyun.bill.v1.CheckEbsPriceInput.Builder, com.didiyun.bill.v1.CheckEbsPriceInputOrBuilder>(
                getEbsGoods(),
                getParentForChildren(),
                isClean());
        ebsGoods_ = null;
      }
      return ebsGoodsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:didi.cloud.bill.v1.CheckEbsPriceRequest)
  }

  // @@protoc_insertion_point(class_scope:didi.cloud.bill.v1.CheckEbsPriceRequest)
  private static final com.didiyun.bill.v1.CheckEbsPriceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.didiyun.bill.v1.CheckEbsPriceRequest();
  }

  public static com.didiyun.bill.v1.CheckEbsPriceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CheckEbsPriceRequest>
      PARSER = new com.google.protobuf.AbstractParser<CheckEbsPriceRequest>() {
    @java.lang.Override
    public CheckEbsPriceRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CheckEbsPriceRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CheckEbsPriceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CheckEbsPriceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.didiyun.bill.v1.CheckEbsPriceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
