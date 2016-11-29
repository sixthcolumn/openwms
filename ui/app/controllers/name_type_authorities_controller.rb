class NameTypeAuthoritiesController < ApplicationController
  before_action :set_name_type_authority, only: [:show, :edit, :update, :destroy]

  # GET /name_type_authorities
  # GET /name_type_authorities.json
  def index
    @name_type_authorities = NameTypeAuthority.all
  end

  # GET /name_type_authorities/1
  # GET /name_type_authorities/1.json
  def show
  end

  # GET /name_type_authorities/new
  def new
    @name_type_authority = NameTypeAuthority.new
  end

  # GET /name_type_authorities/1/edit
  def edit
  end

  # POST /name_type_authorities
  # POST /name_type_authorities.json
  def create
    @name_type_authority = NameTypeAuthority.new(name_type_authority_params)

    respond_to do |format|
      if @name_type_authority.save
        format.html { redirect_to @name_type_authority, notice: 'Name type authority was successfully created.' }
        format.json { render :show, status: :created, location: @name_type_authority }
      else
        format.html { render :new }
        format.json { render json: @name_type_authority.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /name_type_authorities/1
  # PATCH/PUT /name_type_authorities/1.json
  def update
    respond_to do |format|
      if @name_type_authority.update(name_type_authority_params)
        format.html { redirect_to @name_type_authority, notice: 'Name type authority was successfully updated.' }
        format.json { render :show, status: :ok, location: @name_type_authority }
      else
        format.html { render :edit }
        format.json { render json: @name_type_authority.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /name_type_authorities/1
  # DELETE /name_type_authorities/1.json
  def destroy
    @name_type_authority.destroy
    respond_to do |format|
      format.html { redirect_to name_type_authorities_url, notice: 'Name type authority was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_name_type_authority
      @name_type_authority = NameTypeAuthority.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def name_type_authority_params
      params.require(:name_type_authority).permit(:name, :description)
    end
end
