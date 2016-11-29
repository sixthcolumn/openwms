class AddressHazard < ActiveRecord::Base
  belongs_to :address
  belongs_to :hazard
end
